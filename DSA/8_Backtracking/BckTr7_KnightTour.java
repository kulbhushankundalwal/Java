import java.util.*;

public class BckTr7_KnightTour {

    public static boolean isSafe(int chess[][], int n, int i, int j){
        if(i<0 || j<0 || i>=n || j>=n || chess[i][j]!=-1) return false;
        return true;
    }

    public static boolean sol(int chess[][], int n, int i, int j, int moveNum){
        if(moveNum==n*n){
            return true;
        }

        int dx[] = {2,1,-1,-2,-2,-1,1,2};
        int dy[] = {1,2,2,1,-1,-2,-2,-1};
        for(int k=0; k<8; k++){
            int nextI=i+dx[k];
            int nextJ=j+dy[k];
            if(isSafe(chess, n, nextI, nextJ)){
                chess[nextI][nextJ]=moveNum;
                if(sol(chess, n, nextI, nextJ, moveNum+1)){
                    return true;
                }
                else{
                    chess[nextI][nextJ] = -1;
                }
            }
        }
        return false;
    }

    public static void printSol(int chess[][], int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int chess[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(chess[i], -1);
        }

        chess[0][0]=0;
        if(sol(chess, n, 0, 0, 1)){
            printSol(chess, n);
        }
        else{
            System.out.println("Solution not found");
        }
    }
}
