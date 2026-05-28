package Number_Programs;

import java.util.Scanner;

public class SpyNumberr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Emter Number: ");
        int Number = in.nextInt();
        int Sum = 0;
        int Product = 1;
        int Temp = Number;

        while (Temp>0){
            int Mod = Temp % 10;
            Sum = Sum + Mod;
            Product = Product * Mod;
            Temp = Temp / 10;
        }

        if (Sum==Product){
            System.out.println(String.format("%d Is A Spy Number.",Number));
        }else {
            System.out.println(String.format("%d Is Not A Spy Number.",Number));
        }
    }
}
