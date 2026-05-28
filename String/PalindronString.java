package String;

public class PalindronString {
    public static void main(String[] args) {
        String str = "Racecar";

        StringBuilder result = new StringBuilder(str);
        result=result.reverse();

        if(str.equalsIgnoreCase(String.valueOf(result))){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrom");
        }
    }
}
