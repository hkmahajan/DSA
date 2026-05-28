package ExecptionHandling.UnchackedCustomException;

public class InsufficientBalanceException extends RuntimeException{

    InsufficientBalanceException(String msg){
        super(msg);
    }

    public static boolean checkBalance(long acc,double balance,double amount){
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }else{
            return true;
        }
    }
}
