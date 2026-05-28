package Reccrusion;

public class BasicProg {
    public static void main(String[] args) {
        PrintNo(5);
    }

    public static void PrintNo(int num){
        if(num<=0) {
            return;
        }
        PrintNo(num-1);
        System.out.println(num);
    }
}
