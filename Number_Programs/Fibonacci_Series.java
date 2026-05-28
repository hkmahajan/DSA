package Number_Programs;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:");
        int Number = sc.nextInt();

        System.out.println(String.format("Fibonacci of %d is:%d",Number,findFibonacci(Number)));
    }
    public static int findFibonacci(int Number){
        if(Number==0 || Number==1){
            return 1;
        }
        return findFibonacci(Number-1)+findFibonacci(Number-2);

    }

}
