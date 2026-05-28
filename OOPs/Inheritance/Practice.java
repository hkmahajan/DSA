package OOPs.Inheritance;
class MovieTicket{
    String price;
}
class Prime extends MovieTicket {
    int price;

}
class PrimePlus  extends MovieTicket{
    int price;
}
class Recliner extends MovieTicket{
    int price;
}
public class Practice {
    public static void main(String[]args){
        Prime p=new Prime();
        System.out.println(p instanceof MovieTicket);
        MovieTicket m =p;
        Recliner r;
        PrimePlus pp;
        System.out.println(p instanceof Object);
        System.out.println(m instanceof PrimePlus);

    }
}

