package Sorting_Algorithms;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {9,7,8,4,5,6,1,2};
        for(int i=0;i<arr.length;i++){
            int min = min(arr,i);
            int temp;
            if(arr[i]>arr[min]){
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int min(int[] arr,int start){
        int min=start;
        for(int i=start+1;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }
}
