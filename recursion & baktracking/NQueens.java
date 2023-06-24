import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int[][] board = new int[n][n];
        
        solve(0,board,res);
        return res;
    }

    public static void solve(int col,int[][] board,ArrayList<ArrayList<Integer>> res ){
        if(col==board.length){
            ArrayList<Integer> sub = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    sub.add(board[i][j]);
                }
            }
            res.add(sub);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if(isValid(row,col,board)){
                board[row][col]=1;
                solve(col+1, board, res);
                board[row][col]=0;
            }
        }
    }

    public static boolean isValid(int row, int col, int[][] board){
        //left arrow
        for (int index = 0; index < col; index++) {
            if(board[row][index]==1) return false;
        }

        //left Upper diagnoal
        int r=row;
        int c=col;

        while (r>=0 && c>=0) {
            if(board[r][c]==1) return false;
            r--;
            c--;
        }

        //left Lower diagnoal
        r=row;
        c=col;

        while (r<board.length && c>=0) {
            if(board[r][c]==1) return false;
            r++;
            c--;
        }

        return true;
    }

}