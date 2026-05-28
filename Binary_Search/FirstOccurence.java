package Binary_Search;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4,4,4};
        int result = binary(arr,2);
        System.out.println(result);
    }
    public static int binary(int[] arr,int target){
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
}
