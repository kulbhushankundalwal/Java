import java.util.*;

public class J3_ProductWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        System.out.print("The Product is: ");
        int product = a*b;
        System.out.println(product);
    }
}
