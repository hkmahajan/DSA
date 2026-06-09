package Reccrusion;

public class PrimeNum {
    static String str = "Harsh";
    public static void main(String[] args) {
        String rev = StringRev(str);
        System.out.println(rev);
    }
    public static String  StringRev(String str){

        int n = str.length();
       if(str.length()==0 || str.length()<=1){
           return str;
       }

       return str.charAt(n-1)+ StringRev(str.substring(0,n-1));
    }
}
