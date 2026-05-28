package Arrays;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an arrya: ");
        int n = sc.nextInt();
        System.out.println();
        int[] arr = new int[n];
        boolean result=false;
        System.out.print("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]) {
                    result = true;
                    break;
                }
            }
        }
        System.out.print(result);
    }
}
