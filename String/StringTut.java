package String;
import java.util.Arrays;
public class StringTut {
    public static void main(String[] args){

//        String s1 = "Rocky";
//        String s2 = "Rocky";
//        String s3 = new String("Rocky");
//        String s4 = new String("Rocky");
//
//        System.out.println(s1.toString()); //Rocky
//        System.out.println(s2);             //Rocky
//        System.out.println(s3);             //Rocky
//        System.out.println(s4);             //Rocky
//
//        System.out.println(s1 == s2);       //true
//        System.out.println(s2 == s3);       //false
//        System.out.println(s3 == s4);       //false
//
//        String s5 = "Hello   ";
//        System.out.println(s5.length()); //8
//
//        String s6 = new String();
//        System.out.println(s6.length()); //0
//
//        String s7 = null;
//        System.out.println(s7.length()); //NullPointerException

/*        String s1 = "Reverserd";

        StringBuilder s2 = new StringBuilder(s1);

        System.out.println(s2.reverse());
*/

//        String s1 = "hello";
//        int length = s1.length();
//        char[] s2 = s1.toCharArray();
//
//        for(int i=length-1;i>=0;i--){
//            s2[length-i-1]=s1.charAt(i);
//        }
//
//        String result = String.valueOf(s2);
//        System.out.println(result);

        String s3 = "       Hello  My    Name  Is    Harsh ";
         String[] arr = s3.split(" ",2);
        System.out.println(Arrays.toString(arr));
    }
}
