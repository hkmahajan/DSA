package Arrays;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7};
        int k = 3;
        int n=arr.length;
        int[] temp = new int[n];
        int target = 0;

        for(int i=0;i<n;i++){
            temp[(i+k+1)%n]=arr[i];
        }
        System.out.println(findTarget(arr,target));
    }
    public static int findTarget(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid = (end-start)+end/ 2;
            if(arr[mid]==target){
                return mid;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
