import java.util.*;

public class J21_HollowRhombus {

    public static void PatternPrint(int n){
            // Number of Rows
        for(int i=1; i<=n; i++){
            // Print decreasing Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // print hollow rectangle(same as cade as hollow rectangle)
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
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
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        PatternPrint(n);
    }
}
