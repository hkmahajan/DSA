package Binary_Search;

public class CountFreq {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {4,5,5,5,5,6,6,6,7,8,9};

        int target = 5;
        System.out.println(countfreq(arr,target,0,arr.length-1));
    }
    public static int countfreq(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(target == arr[mid]){

            return count;
        }else if(target > arr[mid]){
            return countfreq(arr,target,mid+1,end);
        }else{
            return countfreq(arr,target,start,end);
        }
    }
}
