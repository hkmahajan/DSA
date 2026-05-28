package Pattern_Programs;

public class Number_Patterns {
    public static void main(String[] args) {
//        Number_changing_pyramid();
//        Number_incresing_pyramid();
        Number_incresing_reverse_pyramid();

    }

    public static void Number_changing_pyramid() {
        for(int i=1;i<5;i++){
            for (int j=1;j<5;j++){
                if(i>j){
                    System.out.print(i+j+" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Number_incresing_pyramid(){
        for (int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i>=j){
                    System.out.print(j);
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Number_incresing_reverse_pyramid(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i+j<6){
                    System.out.print(j);
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
