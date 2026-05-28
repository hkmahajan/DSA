package Binary_Search;

public class FloorOfNum {
    static int floor = -1;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        int target = 5;

        findFloor(arr,target,0,arr.length-1);
        System.out.println(floor);
    }
    public static int findFloor(int[] arr,int target,int start, int end){
        if(start>end){
            return -1;
        }

        int mid=(start+end)/2;

        if(target == arr[mid]) {
            floor = arr[mid];
            return floor;
        }else if(target > arr[mid]){
            floor = arr[mid];
            return findFloor(arr,target,mid+1,end);
        }else{
            return findFloor(arr,target,start,mid-1);
        }

    }
}
