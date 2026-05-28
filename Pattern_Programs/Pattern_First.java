package Pattern_Programs;

public class Pattern_First {
    public static void main(String[] args) {
        System.out.println("Diagonal Pattern of *");
        diagonal();
        System.out.println("Non-Diagonal Pattern of *");
        non_diagonal();
        System.out.println("Straight line pattern of *");
        straight_line();
        System.out.println("Lower straight line pattern of *");
        lower_straight_line();
        System.out.println("Left vertical straight line pattern of *");
        left_vertical_straight_line();
        System.out.println("Right vertical straight line pattern of *");
        right_verrical_straight_line();
        System.out.println("Z pattern of *");
        z();
        System.out.println("X pattern of *");
        x();
        System.out.println("Conbination of all above");
        combination();
    }
    public static void diagonal(){
        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if(i==j){
                    System.out.print("*");
                }
                System.out.print("");
            }
            System.out.println();
        }
    }
    public static void non_diagonal(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i+j==4){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void straight_line(){
        for(int i=0;i<5;i++){
            System.out.print("* ");
        }
    }
    public static void lower_straight_line(){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if(i==4){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void left_vertical_straight_line(){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if(j==0){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void right_verrical_straight_line(){
        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if(j==4){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void z(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i==1 || i==5 || i+j==6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void x(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i==j ||i+j==6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void combination(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5 || i==j ||i==j || i+j==6){
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
