import java.util.Scanner;

public class BitM8_PowerOf2OrNot {

    public static int check(int n){
        return n & n-1;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(check(n)==0){
            System.out.println("The number is in the power of 2");
        }
        else{
            System.out.println("The number is not in the power of 2");
        }
    }
}
