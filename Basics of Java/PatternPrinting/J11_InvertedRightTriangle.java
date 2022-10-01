import java.util.Scanner;

public class J11_InvertedRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //Number of lines
        for(int line=1; line<=n; line++){ 
            // Number of Stars
            for(int star=1; star<=n-line+1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
