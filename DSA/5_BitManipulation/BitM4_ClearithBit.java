import java.util.*;

public class BitM4_ClearithBit {
    public static int Clearithbit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter i th postion: ");
        int i = sc.nextInt();

        System.out.println(Clearithbit(n, i));
    }
}
