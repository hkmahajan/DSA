package Number_Programs;
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        int Sqr = Number*Number;
        int Temp = Number;
        Boolean Is_Automorphic_Number = false;

        while (Temp>0){
            int Mod1 = Temp % 10;
            int Mod2 = Sqr % 10;
            if(Mod1==Mod2){
                Is_Automorphic_Number = true;
            }else {
                Is_Automorphic_Number = false;
                break;
            }
            Temp /= 10;
            Sqr /= 10;
        }
        if (Is_Automorphic_Number){
            System.out.println(String.format("%d Is An Automorphic Number.",Number));
        }else {
            System.out.println(String.format("%d Is Not An Automorphic Number.",Number));
        }
    }
}
