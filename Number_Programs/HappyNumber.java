package Number_Programs;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        int temp =Number;
        while(Number!=1 && Number!=4){
            int Temp = Number;
            int sum =0;
            while (Temp!=0){
                int mod = Temp % 10;
                int power = mod * mod;
                sum = sum + power;
                Temp /=10;
            }
            Number = sum;
        }
        if(Number==1){
            System.out.println(String.format("%d Is A Happy Number.",temp));
        }
        if(Number==4){
            System.out.println(String.format("%d Is A Sad Number",temp));
        }
    }
}
