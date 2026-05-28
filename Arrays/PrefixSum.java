package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        int[] prefixsum = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum=sum+arr[j];
            }
            prefixsum[i]=sum;
        }
        System.out.println(Arrays.toString(prefixsum));
        System.out.println("Sum of sub array from index 1 to 3 is: "+(prefixsum[3]-prefixsum[1-1]));
    }

}
