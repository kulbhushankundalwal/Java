import java.util.Scanner;

public class BitM9_CountSetBits {

    public static int CountSetBits(int n) {
        int count = 0;
        while (n != 0) {
            if ((1 & n) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number of set bits in the given number is: " + CountSetBits(n));
    }
}
