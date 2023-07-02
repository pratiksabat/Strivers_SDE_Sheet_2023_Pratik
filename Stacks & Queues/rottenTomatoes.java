import java.util.*;

public class Solution {

    public static int minTimeToRot(int[][] grid, int n, int m) {
        // Write your code here.

        int countFresh = 0;
        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                }
                if (grid[i][j] == 1)
                    countFresh++;
            }
        }

        int[] dRow = { -1, 0, 1, 0 };
        int[] dCol = { 0, 1, 0, -1 };
        int time = 0;
        int cnt = 0;
        while (!q.isEmpty()) {
            int nRow = q.peek().row;
            int nCol = q.peek().col;
            int sec = q.peek().idx;
            time = Math.max(time, sec);
            q.remove();

            for (int i = 0; i < 4; i++) {
                int r = nRow + dRow[i];
                int c = nCol + dCol[i];

                if (r >= 0 && r < n && c >= 0 && c < m && vis[r][c] != 2 && grid[r][c] == 1) {
                    q.add(new Pair(r, c, sec + 1));
                    vis[r][c] = 2;
                    cnt++;
                }
            }
        }
        if (cnt != countFresh)
            return -1;

        return time;
    }

}

class Pair {
    int row, col, idx;

    Pair(int r, int c, int i) {
        row = r;
        col = c;
        idx = i;
    }
}