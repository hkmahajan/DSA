package Linear_Search;

import java.util.Scanner;

public class Linear_Search_Using_Rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Elements: ");
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Target Element:");
        int target = sc.nextInt();
        System.out.println(String.format("Element Found At Position:%d ",Linear_Search(arr,target,0)));
    }
    public static int Linear_Search(int[] arr,int target,int i){
        if(arr[i]==target){
            return i;
        }
        return Linear_Search(arr,target,++i);
    }
}
