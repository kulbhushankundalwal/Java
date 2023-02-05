import java.util.Scanner;

public class BitM2_GetithBit {

    public static int ithbit(int n, int i){
        int bitMask = 1<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter i th postion: ");
        int i = sc.nextInt();

        if(ithbit(n, i)==0){
            System.out.println("i th bit is 0");
        }
        else{
            System.out.println("i th bit is 1");
        }
    }
}
