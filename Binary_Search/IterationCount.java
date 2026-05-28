package Binary_Search;

public class IterationCount {
    static int count = 0;

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 6;
        countItr(nums,target,0, nums.length-1);
        System.out.println(count);
    }
    public static int countItr(int[] nums,int target,int start,int end){
        if(start>end) {
            return -1;
        }
        int mid = (start+end)/2;
        count++;
        if(target == nums[mid]){
            return mid;
        }else if(target > nums[mid]){
            return countItr(nums,target,mid+1,end);
        }else{
            return countItr(nums,target,start,mid-1);
        }
    }
}
