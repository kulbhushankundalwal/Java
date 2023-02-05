import java.util.Scanner;

public class BitM1_EvenOrOdd {
    
    public static int EvenOrOdd(int n){
        int bitMask = 1;
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(EvenOrOdd(n)==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
