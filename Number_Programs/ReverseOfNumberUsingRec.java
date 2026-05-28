package Number_Programs;

import java.util.Scanner;

public class ReverseOfNumberUsingRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = sc.nextInt();
        int Result = ReverseOfNumber(Number,0);
        System.out.println(String.format("Reverse of number: %d is: %d",Number,Result));


    }

    private static int ReverseOfNumber(int Number,int Rev) {
        if(Number==0){
            return Rev;
        }
        Rev = Rev * 10 + Number % 10;
        return ReverseOfNumber(Number/10,Rev);
    }
}
