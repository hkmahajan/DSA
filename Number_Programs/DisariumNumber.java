package Number_Programs;

import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        int Digit_Count = 0;
        int Sum = 0;
        int Temp = Number;

        while (Temp>0){
            Digit_Count++;
            Temp = Temp / 10;
        }

        Temp = Number;

        while (Temp>0){
            int Mod = Temp % 10;
            int Power = (int) Math.pow(Mod,Digit_Count--);
            Sum = Sum + Power;
            Temp = Temp /10;
        }

        if (Number==Sum){
            System.out.println(String.format("%d Is A Disarium Number",Number));
        }else {
            System.out.println(String.format("%d Is Not A Disarium Number",Number));
        }
    }
}
