// Time Complexity = O(n^2)
public class TDArr2_DiagonalSum {

    public static void DiagSum(int matrix[][]){
        int sum=0, n=matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==n-1){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("Diagonal Sum is "+ sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
        DiagSum(matrix);
    }
}

