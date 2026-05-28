package ExecptionHandling;

public class CustomeException {
    public static void main(String[] args) {
        try{
            invalid_age_exception.Validate(21);
        }catch (invalid_age_exception e){
            System.out.println(e.getMessage());

        }
    }
}

class invalid_age_exception extends Exception{
    public invalid_age_exception(String s) {
        super(s);
    }

    public static void Validate(int age) throws invalid_age_exception{
        if(age<18){
            throw new invalid_age_exception("Age is less than 18");
        }else if (age > 100){
            throw new invalid_age_exception("Age is greater than 100");
        }else{
            System.out.println("You can vote.........|");
        }
    }

}
