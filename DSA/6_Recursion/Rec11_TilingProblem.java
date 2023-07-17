// for 2xN Floor & 2x1 Tile

// Amazon

public class Rec11_TilingProblem {

    public static int ways(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        //f(n-1) - vertical choice
        int fnm1 = ways(n - 1);

        //f(n-2) - horizontal choice 
        int fnm2 = ways(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}
