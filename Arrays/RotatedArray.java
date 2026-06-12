package Arrays;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] rot = new int[arr.length];
        int n = arr.length;
        for (int i=0;i<n;i++){
            rot[(i+4)%n]=arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rot));
    }
}
