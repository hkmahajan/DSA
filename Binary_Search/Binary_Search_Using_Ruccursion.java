package Binary_Search;

public class Binary_Search_Using_Ruccursion {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int target = 5;
        int result = BinarySearch(arr,target,0,arr.length-1);
        System.out.println(result);
    }
    public static int BinarySearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return BinarySearch(arr,target,start,mid-1);
        }else{
            return BinarySearch(arr,target,mid+1,end);
        }

    }
}
