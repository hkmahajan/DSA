package ExecptionHandling.CheckedCustomException;

public class Vote {
    public static void main(String[] args)  {
        try {
            checkEligibility(16);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        } finally {
            System.out.println("Eligibility Verified...!");
        }

    }
    public static void checkEligibility(int age) throws InvalidAgeException {
        if(age>18){
            System.out.println("You can Vote....!");
        }else {
            throw new InvalidAgeException("Insufficient age for voting..!");
        }
    }
}
