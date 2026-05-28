package Number_Programs;
import java.util.Scanner;
/*
A strong number (or Factorion) is a positive integer where
the sum of the factorials of its digits equals the original number.

Examples:

1! = 1.
2! = 2.
145! = 1! + 4! +5! = 1 + 24 + 120 = 145.
*/

public class StrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        int Sum =0;
        int Temp = Number;

        while(Temp>0){
            int Mod = Temp % 10;
            int Factorial = 1;
            while(Mod>0){
                Factorial = Factorial * Mod;
                Mod--;
            }
            Sum = Sum + Factorial;
            Temp = Temp /10;
        }
        if (Number==Sum){
            System.out.println(String.format("%d Is Strong Number",Number));
        }else {
            System.out.println(String.format("%d Is Not Strong Number",Number));
        }
    }
}


/*
Algorithm to Check a Strong Number

1)Input a number and store it in a variable (e.g., temp).
2)Initialize sum = 0.
3)Extract each digit from the number using modulo operator (% 10).
4)Calculate the factorial of the digit.
5)Add to the sum.
6)Remove the last digit from the number (/ 10).
7)Repeat steps 3-6 until the number becomes
8)Compare sum with the original number. If sum == original, it is a strong number.

*/