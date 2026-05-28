package ExecptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {4, 5, 7, 1, 2, 3};
        String str = "harsh";

        System.out.println("======= Welcome =======");
        System.out.println("1. Fetch element from array");
        System.out.println("2. Fetch character from string");
        System.out.print("Enter choice: ");

        try {

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Array: {4,5,7,1,2,3}");
                    System.out.print("Enter index: ");

                    int index = sc.nextInt();

                    // Direct array access
                    System.out.println("Element: " + arr[index]);
                    break;

                case 2:
                    System.out.println("String: " + str);
                    System.out.print("Enter character index: ");

                    int c = sc.nextInt();

                    // Direct string access
                    System.out.println("Character: " + str.charAt(c));
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } catch (InputMismatchException e) {

            System.err.println("Only numbers are allowed.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.err.println("Array index is out of range.");

        } catch (StringIndexOutOfBoundsException e) {

            System.err.println("String index is out of range.");

        } catch (Exception e) {

            System.err.println("Some unexpected exception occurred.");

        } finally {

            System.out.println("Program executed successfully.");
            sc.close();
        }
    }
}