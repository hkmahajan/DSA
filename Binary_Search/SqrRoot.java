package Binary_Search;

public class SqrRoot {
    static int sqrrt = 0;
    public static void main(String[] args) {
        System.out.println(sqrroot(626,0,626));
    }
    public static int sqrroot(int target,int start,int end){
        if(start>end){
            return sqrrt;
        }

        int mid = (start+end)/2;
        if(target == mid*mid){
            sqrrt=mid;
            return sqrrt;
        } else if (mid*mid > target) {
            return sqrroot(target,start,mid-1);
        }else{
            sqrrt=mid;
            return sqrroot(target,mid+1,end);
        }
    }
}
