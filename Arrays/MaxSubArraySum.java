package Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        System.out.println(MaxSumInSubArray(arr));


    }
    public static int MaxSumInSubArray(int[] arr){
        int MaxSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    sum=sum+arr[k];
                    if(k<j){
                        System.out.print(",");
                    }
                }
                MaxSum=Math.max(MaxSum,sum);
                System.out.print(")");
                System.out.println();
            }
        }
        return MaxSum;
    }
}
