

public class Rec2_PrintIncOrderNum {
    public static void printnum(int n) {
        if (n == 0) {
            System.out.print(0 + " ");
            return;
        }
        printnum(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printnum(3);
        ;
    }
}
