import java.util.Scanner;

public class J9_NumIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) { // for(int i=2; i<=Math.sqrt(n); i++) to make it more optamized
                if (n % i == 0) {
                    isPrime = false;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
