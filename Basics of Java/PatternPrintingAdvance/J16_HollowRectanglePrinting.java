import java.util.*;

public class J16_HollowRectanglePrinting {
    public static void HollowRectangle(int row, int colm){
        //Row wise Loop
        for(int i = 1; i <= row; i++){
            //Column wise Loop
            for(int j = 1; j <= colm; j++){
                if(i==1 || i==row || j==1 || j==colm){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int colm = sc.nextInt();
        HollowRectangle(row, colm);
    }
}
