package OOPs.Inheritance;

class Cab {
    int price;

    @Override
    public String toString() {
        return "Cab Price: "+this.price;
    }
}
class Mini extends Cab{
    int price=100;

    @Override
    public String toString() {
        return "Mini Price: "+this.price;
    }
}
class Sedan extends Cab{
    int price=150;

    @Override
    public String toString() {
        return "Sedan Price: "+this.price;
    }
}
class Suv extends Cab{
    int price = 200;

    @Override
    public String toString() {
        return " Suv Price: "+this.price;
    }
}
class Laxury extends Cab {
    int price = 500;

    @Override
    public String toString() {
        return "Laxury Price: "+this.price;
    }
}
public class CabDriver{
    public static void main(String[] args) {
        Cab c = new Mini();
        System.out.println(c);

    }
}
