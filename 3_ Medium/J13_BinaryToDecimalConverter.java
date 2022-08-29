import java.util.Scanner;

public class J13_BinaryToDecimalConverter {
    public static int BtoD(int bin){
        int decimal = 0;
        int pow = 0;
        while(bin>0){
            int LastDigit = bin%10;
            decimal = decimal + (LastDigit * (int)Math.pow(2, pow));
            bin = bin/10;
            pow++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int bin = sc.nextInt();
        System.out.println("The equivalent Decimal is: " + BtoD(bin));
    }
}
