public static ArrayList<String> findPath(int[][] m, int n) {
    ArrayList<String> ans = new ArrayList<String>() ;
    BlockedMaze(m , 0 , 0 , ans , "" , new boolean[n][n]) ;
    return ans ;
}
public static void BlockedMaze(int [][]m , int row , int col , ArrayList<String> ans , String res , boolean[][] visited) {
    // positive base case
    if(row == m.length - 1 && col == m[0].length-1 && m[row][col] == 1){
        ans.add(res) ;
        return;
    }
    // negative base case
    if(row == -1 || row == m.length || col == m[0].length || col == -1 || m[row][col] == 0 || visited[row][col]) return;
    
    // mark the visited cell
    visited[row][col] = true ;
    
    BlockedMaze(m , row - 1 , col , ans , res+"U" , visited) ;
    BlockedMaze(m , row + 1 , col , ans , res+"D" , visited) ;
    BlockedMaze(m , row , col - 1 , ans , res+"L" , visited) ;
    BlockedMaze(m , row , col + 1 , ans , res+"R" , visited) ;
    
    // un-mark the visited cell and backtrack
    visited[row][col] = false ;
}