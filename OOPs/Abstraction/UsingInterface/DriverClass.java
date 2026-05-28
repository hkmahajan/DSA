package OOPs.Abstraction.UsingInterface;

interface Super {
    int age = 18;
     void display();
}

interface Sub {
    int age = 20;
}

class driver implements Super,Sub{
    @Override
    public void display(){
        System.out.println("Hello");
    }
}

public class DriverClass{
    public static void main(String[] args) {
        driver d = new driver();
        d.display();
    }
}