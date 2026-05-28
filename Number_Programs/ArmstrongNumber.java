package Number_Programs;
import java.util.Scanner;


/*
An Armstrong number (also known as a narcissistic number or pluperfect digital invariant)
is a number that is equal to the sum of its own digits, each raised to the power of the
total number of digits in that number.

*/


public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        int Digit_count = 0;
        int Sum = 0;
        int Temp = Number;

        while (Temp>0) {
            Digit_count++;
            Temp/=10;
        }

        Temp=Number;

        while (Temp>0){
            int Mod = Temp % 10;
            int Power = (int) Math.pow(Mod,Digit_count);
            Sum = Sum + Power;
            Temp /= 10;
        }

        if (Number==Sum){
            System.out.println(String.format("%d Is An Armstrong Number",Number));
        }else {
            System.out.println(String.format("%d Is Not An Armstrong Number",Number));
        }
    }
}

/*

Algorithm to Check a Strong Number

1) Count Digits: Determine the total number of digits in the number.
2) Extract Digits: Use a loop with % 10 to get the last digit and / 10 to remove it.
3) Power Sum: Raise each digit to the power of \(k\) and sum these values.
4) Compare: If the calculated sum matches the original number, it is an Armstrong number.

 */
