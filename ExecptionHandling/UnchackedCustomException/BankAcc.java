package ExecptionHandling.UnchackedCustomException;

import static ExecptionHandling.UnchackedCustomException.InsufficientBalanceException.checkBalance;

public class BankAcc {

    private String name;
    private long accNO;
    private double balance;

    BankAcc(String name,long accNO,double balance){
        if(balance>=500){
            this.name=name;
            this.accNO=accNO;
            this.balance=balance;
        }else{
            throw new InsufficientBalanceException("Insufficient Balance.");
        }
    }

    public void withdrawal(double amount){
        if(checkBalance(this.accNO,this.balance,amount)){
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Acc No: %d | Balance: %f",this.name,this.accNO,this.balance);
    }

    public static void main(String[] args) {

        BankAcc a1 = new BankAcc("Harsh",123456789,450);
        System.out.println(a1);
        a1.withdrawal(2001);
        System.out.println(a1);


    }
}

