// Asked in Goldman Sachs

// Friends Pairing Problem - Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.

public class Rec13_FriendsPairing {

    public static int ways(int n) {
        if (n == 1 || n == 2) {
            //for n=1 -> 1 way (single)
            //for n=2 -> 2 ways (single-single or pair)
            return n;
        }

        // Two choices -

        // 1. Single
        int fnm1 = ways(n - 1);

        // 2. Pair (There is n-1 ways/choice to pair up)
        int fnm2 = (n - 1) * ways(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(ways(3));
    }
}
