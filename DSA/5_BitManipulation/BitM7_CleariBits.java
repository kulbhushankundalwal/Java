import java.util.*;

public class BitM7_CleariBits {
    public static int CleariBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (i << 1) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter i th postion: ");
        int i = sc.nextInt();
        System.out.print("Enter j th bit: ");
        int j = sc.nextInt();

        System.out.println(CleariBits(n, i, j));
    }
}