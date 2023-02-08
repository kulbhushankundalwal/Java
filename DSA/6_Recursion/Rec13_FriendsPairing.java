// Goldman Sachs

public class Rec13_FriendsPairing {

    public static int ways(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int fnm1 = ways(n - 1);

        int fnm2 = (n - 1) * ways(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(ways(3));
    }
}
