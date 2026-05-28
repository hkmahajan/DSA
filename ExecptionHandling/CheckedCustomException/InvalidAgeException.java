package ExecptionHandling.CheckedCustomException;

public class InvalidAgeException extends Throwable{
    InvalidAgeException(String msg){
        super(msg);
    }

    @Override
    public String toString() {
        return "Invalid Age you cannot vote...!";
    }
}
