package Arrays;

public class MinSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        System.out.println(MinSumInSubArray(arr));


    }
    public static int MinSumInSubArray(int[] arr){
        int MinSum=0;
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
                MinSum=Math.min(MinSum,sum);
                System.out.print(")");
                System.out.println();
            }
        }
        return MinSum;
    }
}
