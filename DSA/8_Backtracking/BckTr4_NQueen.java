//Time Complexity is O(n!)

public class BckTr4_NQueen {

    public static boolean isPosible(char board[][], int row, int col){
        
        //Vertical Up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q') return false;
        }

        //Diagonal Left Up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q') return false;
        }
        
        //Diagonal Right Up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q') return false;
        }

        return true;
    }

    public static void NQueenSol(char board[][], int row){
        int n = board.length;
        
        //base 
        if(row==board.length){
            printBoard(board);
            return;
        }
        
        //Column Loop
        for(int j=0; j<n; j++){
            if(isPosible(board, row, j)){
                board[row][j]='Q';
                NQueenSol(board, row+1); //function call
                board[row][j]='X'; //backtracking
            }
        }
    }

    public static void printBoard(char board[][]){
        int n = board.length;
        System.out.println("-----------------");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        //Initialise
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j]='X';
            }
        }
        NQueenSol(board, 0);
    }
}
