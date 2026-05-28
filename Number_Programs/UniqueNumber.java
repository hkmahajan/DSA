package Number_Programs;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Number = in.nextInt();
        int Temp=Number;
        boolean Is_Duplicate = true;
        HashMap<Integer,Integer> Num = new HashMap<>();

        while (Temp>0){
            int Mod = Temp % 10;
            Num.put(Mod,Num.getOrDefault(Mod,1)+1);
            Temp /= 10;
        }

        for (Integer i : Num.values()){
            if(i>1){
                Is_Duplicate=false;
                break;
            }
        }

        if (Is_Duplicate){
            System.out.println(String.format("%d Is A unique Number",Number));
        }else {
            System.out.println(String.format("%d Is Not A unique Number",Number));
        }
    }
}
