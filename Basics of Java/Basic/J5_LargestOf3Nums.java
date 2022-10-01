import java.util.Scanner;

public class J5_LargestOf3Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number A: ");  
        int A = sc.nextInt();
        System.out.print("Enter number B: ");        
        int B = sc.nextInt();
        System.out.print("Enter number C: ");        
        int C = sc.nextInt();

        if(A>B && A>C){
            System.out.println("A = " + A + " is the largest number");
        }
        else if(B>C){
            System.out.println("B = " + B + " is the largest number");
        }
        else{
            System.out.println("C = " + C + " is the largest number");
        }

    }
}
