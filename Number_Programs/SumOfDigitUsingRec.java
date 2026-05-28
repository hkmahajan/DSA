package Number_Programs;

public class SumOfDigitUsingRec {
    public static void main(String[] args) {
        int result = Sum(123);
        System.out.println(result);
    }
    public static int Sum(int num){
        int sum = 0;
        if(num==0){
            return 0;
        }
        sum = num%10 + Sum(num/10);
        return sum;
    }
}
