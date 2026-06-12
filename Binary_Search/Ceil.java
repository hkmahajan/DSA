package Binary_Search;

public class Ceil {
    public static void main(String[] args) {
        double[] arr = {1,1.2,1.9,2,2.1,3,5,5.4,6};
        double target = 1.5;
        double result = ceil(arr,target);
        System.out.println(result);

    }
    public static double ceil(double[] arr,double target){
        int ceil = 0;

        int start = 0;
        int end = arr.length-1;

    while (start<=end){
        int mid = (start+end)/2;
        if(target==arr[mid]){
            return arr[mid];
        }else if(target>arr[mid]){
            start=mid+1;
            ceil=start;
        }else {
            end=mid-1;
        }
    }
        if (start == arr.length) {
            return -1;
        }

        return arr[ceil];
    }
}
