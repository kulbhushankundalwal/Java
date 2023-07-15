public class TDArr1_SpiralMatrix {

    public static void printSM(int matrix[][]){
        int startRow=0, startCol=0;
        int endRow=matrix.length-1, endCol=matrix[0].length-1;
        
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow==endRow){ //for last iteration in Odd Matrix, like 5x5 
                    break;            //This will not run as top already printed the single remaining row.
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(endCol==startCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][]={{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {14, 15, 16, 17},
                    {18, 19, 20, 21}}; 
        printSM(matrix);
    }
}
