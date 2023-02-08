import java.util.Scanner;

public class BitM5_UpdateithBit {
    public static int Clearithbit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int UpdateithBit(int n, int i, int newBit){
        n = Clearithbit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter i th postion: ");
        int i = sc.nextInt();
        System.out.print("Enter new bit: ");
        int newBit = sc.nextInt();

        System.out.println(UpdateithBit(n, i, newBit));
    }
}
