
public class Rec9_PowerOfN {

    public static int pow(int num, int n){
        if(n==0){
            return 1;
        }
        return num*pow(num, n-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 4));
    }
}
