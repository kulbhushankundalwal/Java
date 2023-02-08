import java.util.*;

public class BitM6_ClearLastiBits {

    public static int ClearLastibits(int n, int i){
        int bitMask = ((~0) << i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter i th postion: ");
        int i = sc.nextInt();

        System.out.println(ClearLastibits(n, i));
    }
}
