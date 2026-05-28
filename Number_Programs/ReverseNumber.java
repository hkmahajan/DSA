package Number_Programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        int Reverse = 0;
        int Temp = Number;

        while (Temp>0){
            int Mod = Temp % 10;
            Reverse = Reverse * 10 + Mod;
            Temp /= 10;
        }

        System.out.println(String.format("Reverse Of Number: %d Is: %d ",Number,Reverse));
    }
}
