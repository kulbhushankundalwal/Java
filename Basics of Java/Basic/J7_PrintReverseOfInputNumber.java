import java.util.Scanner;

public class J7_PrintReverseOfInputNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Reverse of the given number is: ");
        while(num>0){
            System.out.print(num%10);
            num/=10;
        }
    }
}
