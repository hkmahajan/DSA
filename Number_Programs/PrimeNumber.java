package Number_Programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = sc.nextInt();
        boolean IsPriem = true;

        for(int i=2;i*i<=Number;i++){
            if(Number%i==0){
                IsPriem=false;
                break;
            }
        }
        System.out.println(IsPriem?String.format("%d Is prime.",Number):String.format("%d is not prime.",Number));
    }


}
