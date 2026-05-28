package Number_Programs;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        int Digit_Count = 0;
        boolean Zero_Present = false;
        boolean Zero_At_Start = false;
        int Temp = Number;

        while (Temp>0){
            Digit_Count++;
            Temp/=10;
        }
        Temp=Number;

        while (Temp>0 && Digit_Count>0){
            int Mod = Temp % 10;
            if(Mod==0){
                Zero_Present = true;
            }
            if(Digit_Count==1 && Mod==0){
                Zero_At_Start = true;
            }
            Temp/=10;
            Digit_Count--;
        }

        if(Zero_Present && !Zero_At_Start){
            System.out.println(String.format("%d Is A Duck Number.",Number));
        }else {
            System.out.println(String.format("%d Is Not A Duck Number.",Number));
        }
    }
}
