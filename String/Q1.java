package String;

public class Q1 {
    public static void main(String[] args) {
        String name = "harsh is good";
        String[] arr = name.split(" ");
        StringBuilder str = new StringBuilder();
        String result;
        for(String i : arr){
            str.append(i).reverse();
            str.append(" ");
        }

        result = String.valueOf(str);

        System.out.println(result);

    }
}
