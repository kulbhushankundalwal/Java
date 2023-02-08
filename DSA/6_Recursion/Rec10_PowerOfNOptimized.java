// Time Complexity is O(log n)

public class Rec10_PowerOfNOptimized {
    
    public static int powOp(int num, int n){
        if(n==0){
            return 1;
        }

        int halfPow = powOp(num, n/2);
        int halfPowSq = halfPow*halfPow;

        if(n/2!=0){
            halfPowSq*=n;
        }

        return halfPowSq;
    }
    public static void main(String[] args) {
        System.out.println(powOp(2, 4));
    }
}