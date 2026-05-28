package Binary_Search;

public class FirstOccRec {
    static int result = 0;
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,3,3,4,4,4,};

        int target = 3;
        System.out.println(firstOcc(arr,target,0,arr.length-1));

    }
    public static int firstOcc(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(target == arr[mid]){
            result=mid;
            return firstOcc(arr,target,start,mid-1);
        }else if(target > arr[mid]){
            return firstOcc(arr,target,mid+1,end);
        }else{
            firstOcc(arr,target,start,mid-1);
        }
        return result;
    }
}
