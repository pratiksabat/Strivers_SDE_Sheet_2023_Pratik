public class Solution
{
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
        int[][] ans = image;
        int iniColor = image[x][y];
        int[] dRow = {-1,0,1,0};
        int[] dCol = {0,1,0,-1};
        dfs(image,x,y,newColor,iniColor,ans,dRow,dCol);
        return ans;
    }

    public static void dfs(int[][] image, int x, int y, int newColor, int iniColor, int[][] ans, int[] dRow, int[] dCol){
        ans[x][y]=newColor;
        int r = image.length;
        int c = image[0].length;
        for (int i = 0; i < dCol.length; i++) {
            int col = y+dCol[i];
            int row = x+dRow[i];

            if(col>=0 && col<c && row>=0 && row<r && image[row][col]==iniColor && ans[row][col]!=newColor){
                dfs(image,row,col,newColor,iniColor,ans,dRow,dCol);
            }
        }
    }
}

