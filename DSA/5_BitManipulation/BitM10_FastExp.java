import java.util.Scanner;


public class BitM10_FastExp {

    public static int FastEx(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
               ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }

        return ans;

    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int n = sc.nextInt();

        System.out.println("Answer: " + FastEx(a, n));
    }
}
