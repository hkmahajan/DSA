package Binary_Search;

public class SearchEleInRotArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,0,1,2,3};
        int target = 0;
        System.out.println(searchInRotatedArray(arr,target,0,arr.length-1));
    }
    public static int searchInRotatedArray(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start) / 2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(arr[start]<=target && arr[mid]>target){
                return searchInRotatedArray(arr,target,start,mid-1);
            }else{
                return searchInRotatedArray(arr,target,mid+1,end);
            }
        }else{
            if(arr[end]>=target && arr[mid]<target){
                return searchInRotatedArray(arr,target,mid+1,end);
            }else{
                return searchInRotatedArray(arr,target,start,mid-1);
            }
        }
    }
}
