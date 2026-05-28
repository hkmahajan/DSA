package ExecptionHandling;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        System.out.println("main() started");

        Object obj = new Object();
        System.out.println(obj);

        try{
            String s = (String) obj;
            System.out.println(s);
        }catch (ClassCastException e){
            System.err.println("Invalid Type Casting");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally Block Executed.");
        }

        System.out.println("main() ended");
    }
}
