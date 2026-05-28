package Binary_Search;

public class LastOccRec {
    static int index =0;
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,4,5,5,5,6,6,6,7};

        int target = 6;
        countLastOcc(arr,target,0,arr.length-1);
        System.out.println(index);
    }
    public static int countLastOcc(int[] arr,int target, int start, int end){
        if(start>end){
            return -1;
        }

        int mid = (start+end)/2;

        if(target == arr[mid]){
            index=mid;
            return countLastOcc(arr,target,mid+1,end);
        }else if(target > arr[mid]){
            return countLastOcc(arr,target,mid+1,end);
        }else{
            return countLastOcc(arr,target,start,mid-1);
        }
    }
}
