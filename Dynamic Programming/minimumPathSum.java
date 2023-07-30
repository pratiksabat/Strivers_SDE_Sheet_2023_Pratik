import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minSumPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
    	int prev[] = new int[m];
    for(int i=0; i<n ; i++){
        int temp[] = new int[m];
        for(int j=0; j<m; j++){
            if(i==0 && j==0) temp[j] = matrix[i][j];
            else{
                
                int up = matrix[i][j];
                if(i>0) up += prev[j];
                else up += (int)Math.pow(10,9);
                
                int left = matrix[i][j];
                if(j>0) left+=temp[j-1];
                else left += (int)Math.pow(10,9);
                
                temp[j] = Math.min(up,left);
            }
        }
        prev=temp;
    }
    
    return prev[m-1];
    }
}