package Number_Programs;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        int Temp = Number;
        int Sum = 1;
        if(Number==0 || Number==1){
            System.out.println(String.format(" Factorial Of Number %d is %d",Number,1));
        }

        while (Temp>1){
            Sum = Sum * Temp;
            Temp--;
        }

        System.out.println(String.format("Factorial Of Number %d is %d",Number,Sum));
        System.out.println(String.format("Factorial Of Number %d is %d",Number,factorial(Number)));
    }

    // Using recursion
    public static int factorial(int num){
        int fact = 1;
        if(num == 1){
            return 1;
        }
        fact = num * factorial(--num);
        return fact;
    }
}
