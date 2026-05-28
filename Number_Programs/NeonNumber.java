package Number_Programs;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        int Sqr = Number*Number;
        int Temp = Sqr;
        int Sum = 0;

        while (Temp>0){
            int Mod = Temp % 10;
            Sum = Sum + Mod;
            Temp /= 10;
        }

        if (Number==Sum){
            System.out.println(String.format("%d Is A Neon Number",Number));
        }else {
            System.out.println(String.format("%d Is Not A Neon Number",Number));
        }
    }
}
