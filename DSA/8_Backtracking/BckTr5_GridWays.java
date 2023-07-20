// Find number of ways to reach from (0,0) to (N-1, M-1) in a NxM Grid
// Allowed moves - right or down.

// Time Complexity is O(2^(n+m)) --> for backtracking method

// Use (n-1 + m-1)! / ((n-1)!+(m-1)!) --> get direct answer with this formula
// Time Complexity is O(n+m) for above

public class BckTr5_GridWays {

    public static int gridWays(int i, int j, int n, int m){
        if(i==n-1 && j==m-1){  //Condition for last case
            return 1;
        }
        else if(i==n || j==m){ //Boundary Cross Condition
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
