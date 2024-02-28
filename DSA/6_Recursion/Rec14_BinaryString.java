//Asked in PayTM

//Print all binary strings of size N without consecutive ones.

public class Rec14_BinaryString {
    public static void printBString(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        printBString(n-1, 0, str+"0");
        if(lastPlace==0){
            printBString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        printBString(5, 0, "");
    }
}
