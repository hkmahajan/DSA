package String;

public class WordRev {
    public static void main(String[] args) {
        String str = "Hello how are you";

        String[] arr = str.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            result = new StringBuilder(result + arr[i] + " ");
        }


        System.out.println(result);
    }
}
