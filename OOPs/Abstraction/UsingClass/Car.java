package OOPs.Abstraction.UsingClass;

abstract class Vehical {
    String vehicalName;
    int cc;
    String engineType;

    abstract void start();

    abstract void display();

    public void run(){
        System.out.println("Car is running");
    }

    Vehical(String vehicalName,int cc,String engineType){
        this.vehicalName=vehicalName;
        this.cc=cc;
        this.engineType=engineType;
    }
}

public class Car extends Vehical {

    String Model;

    Car(String vehicalName,String Model, int cc, String engineType) {
        super(vehicalName, cc, engineType);
        this.Model=Model;
    }

    @Override
    void start() {
        System.out.println("Your " + vehicalName + " Is started succcefuly");
    }

    @Override
    void display() {
        System.out.println(this.vehicalName);
        System.out.println(this.Model);
        System.out.println(this.cc);
        System.out.println(this.engineType);
    }

    public static void main(String[] args) {
        Car Car1 = new Car("Harrier","top",1200,"petrol");

        Car1.start();
        Car1.display();
    }
}
