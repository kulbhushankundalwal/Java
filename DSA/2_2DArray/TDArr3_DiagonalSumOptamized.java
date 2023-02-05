// Time Complexity = O(n)
public class TDArr3_DiagonalSumOptamized {

    public static void DiagSum(int matrix[][]){
        int sum=0, n=matrix.length;
        for(int i=0; i<n; i++){
            sum+=matrix[i][i];
            if(i!=n-i-1){
                sum+=matrix[i][i];
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

