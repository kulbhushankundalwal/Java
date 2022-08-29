import java.util.Scanner;

public class J8_StoreReverseOfInputNum {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;

        while(num>0){
            rev = (rev*10) + (num%10);
            num/=10;
        }
        System.out.print("Reverse of the number is: " + rev);
    }
    
}
