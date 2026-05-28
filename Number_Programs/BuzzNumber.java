package Number_Programs;

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        boolean Is_Buzz = false;
        if(Number%10==7){
            Is_Buzz=true;
        }
        if(Number%7==0){
            Is_Buzz=true;
        }
        if(Is_Buzz){
            System.out.println(String.format("%d Is A Buzz Number",Number));
        }else {
            System.out.println(String.format("%d Is Not A Buzz Number",Number));
        }
    }
}
