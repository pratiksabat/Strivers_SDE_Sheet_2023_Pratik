import java.util.* ;
import java.io.*; 
public class Solution {
	public static String graphColoring(int[][] mat, int m) {
		// Write your code here
		int[] colors = new int[mat.length];
		return solve(mat,0,colors,m)?"YES":"NO";

	}

	public static boolean solve(int[][] mat,int idx,int[] colors, int m){
		if(idx==mat.length) return true;

		for (int i=1; i<=m; i++) {
			if(canColor(mat,idx,colors,i)){
				colors[idx]=i;
				if(solve(mat, idx+1, colors, m)) return true;
				colors[idx]=0;
			}
		}
		return false;
	}

	public static boolean canColor(int[][] mat,int idx,int[] colors, int color){
		 for (int i = 0; i < mat.length; i++) {
            if (mat[idx][i] == 1 && colors[i] == color)
                return false;
        }
        return true;
	}
}
