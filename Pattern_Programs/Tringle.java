package Pattern_Programs;

public class Tringle {
    public static void main(String[] args) {
        Right_half_pyramid();
        Hellow_right_half_pyramid();
        Reverse_right_half_pyramid();
        Hollow_reverse_right_half_pyramid();
        Left_half_pyramid();
        Hollow_left_half_pyramid();
        Reverse_left_half_pyramid();
        Hollow_reverse_left_half_pyramid();
    }

    private static void Right_half_pyramid() {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i>=j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void Hellow_right_half_pyramid() {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(j==1 || i==5 || i==j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Reverse_right_half_pyramid() {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i+j<=6){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Hollow_reverse_right_half_pyramid() {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i==1 || j==1 || i+j==6){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Left_half_pyramid() {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i+j>=6){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Hollow_left_half_pyramid() {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i==5 || j==5 || i+j==6){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Reverse_left_half_pyramid(){
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(j>=i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Hollow_reverse_left_half_pyramid(){
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(j==5 || i==1 || j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
