package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr ={4,1,3,2};
        System.out.println();
        mergeSort(arr,0,arr.length-1);
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,low);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low,int mid,int high){
        List<Integer> list = new ArrayList<>();

        int rigth = low;
        int left = mid;

        while (rigth<=mid && left<=high){
            if(arr[rigth]<arr[left]){
                list.add(arr[rigth]);
                rigth++;
            }else {
                list.add(arr[left]);
                left++;
            }
        }

        while (rigth<=mid){
            list.add(arr[rigth]);
            rigth++;
        }

        while (left<=high){
            list.add(arr[left]);
            left++;
        }

        System.out.println(list);
    }

}
