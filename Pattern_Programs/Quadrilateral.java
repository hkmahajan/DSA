package Pattern_Programs;

public class Quadrilateral {
    public static void main(String[] args) {
        Square();
        hollow_Square();
        rectangle();
        hollow_rectangle();
        Equlatral_Traingle();
    }
    public static void Square(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void hollow_Square(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void rectangle(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=10;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void hollow_rectangle(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=10;j++){
                if(i==1 || i==5 || j==1 || j==10){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Equlatral_Traingle(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i<=j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            for (int k=1;k<=5;k++){
                if(i>=k){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }


}
