import java.util.*;

public class BitM3_SetithBit {
    public static int Setithbit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter i th postion: ");
        int i = sc.nextInt();

        System.out.println(Setithbit(n, i));
    }
}
