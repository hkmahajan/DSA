package ExecptionHandling;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println("main() started");
        try{
            division(a,b);
        }catch (ArithmeticException e){
           e.printStackTrace();
        }
        System.out.println("main() ended");

    }
    public static void division(int a, int b){
        System.out.println("Division() started");
        System.out.println("Result: " + test(a,b));
        System.out.println("Division() ended");
    }
    public static int test(int a,int b){
        return a/b; //Migth get arithmatic exception
    }

}


