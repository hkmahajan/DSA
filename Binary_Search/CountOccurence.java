package Binary_Search;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,1,2,2,3,3,3,4,4,4,4,4};
        int target = in.nextInt();
        int first = first_occurence(arr,target);
        int last = last_occurence(arr,target);
        System.out.println(last-first+1);
    }
    public static int first_occurence(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int result=-1;


        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                result=mid;
                end=mid-1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;

    }
    public static int last_occurence(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int result=-1;


        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                result=mid;
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
}
