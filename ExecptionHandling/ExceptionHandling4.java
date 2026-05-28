package ExecptionHandling;
import java.lang.Thread;
public class ExceptionHandling4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main() started");
        printcharacteronebyobe("HITMAN");
        System.out.println("Main() ended");
    }
    public static void printcharacteronebyobe(String str) throws InterruptedException{

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            Thread.sleep(1000);
        }

    }
}
