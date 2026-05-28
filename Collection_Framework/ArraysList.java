package Collection_Framework;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(0,0);
//        System.out.println(arr);
//        int[] arr2 = {1,2,3,4,5,6};
//        int[] arr3 = Arrays.copyOfRange(arr2,2,4);
//        System.out.println(Arrays.toString(arr3));

        int[][] arr4 = {{1,2,3},{4,5,6,7,8},{9,10}};
        for(int i=0;i<arr4.length;i++){
            for (int j=0;j<arr4[i].length;j++){
                System.out.print(arr4[i][j]+" ");

            }
            System.out.println();
        }
        /*
        * length > index
        * 10 size length=> 0
        * 0 index
        * index of out bounds for length 0
        * */

    }
}
