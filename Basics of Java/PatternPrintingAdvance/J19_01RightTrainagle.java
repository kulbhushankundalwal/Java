import java.util.*;

public class J19_01RightTrainagle {

    public static void PatternPrint(int n){
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    num=1;
                }
                else{
                    num=0;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        PatternPrint(n);
    }
}
