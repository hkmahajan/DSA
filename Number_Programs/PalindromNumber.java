package Number_Programs;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        int Reverse = 0;
        int Temp = Number;

        while(Temp>0){
            int Mod = Temp % 10;
            Reverse = Reverse * 10 + Mod;
            Temp /= 10;
        }

        if (Number==Reverse){
            System.out.println(String.format("%d Is A Palindrom Number.",Number));
        }else {
            System.out.println(String.format("%d Is A Not Palindrom Number.",Number));
        }
    }
}
