import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		// Using Recursion only
		// return getAns(0,0,m,n);

		// Using Recursion+DP
		// int[][] dp = new int[m][n];
		
		// return getAnsUsingDP(0,0,m,n,dp);

		int N=m+n-2;
		int R=m-1;
		double ans=1;

		for (int i = 1; i <= R; i++) {
			ans=ans*(N-R+i)/i;
		}
		return (int)ans;
	}
	public static int getAns(int i, int j,int m, int n) {
		// Write your code here.
		if(i==m-1 || j==n-1) return 1;
		if(i>=m || j>=n) return 0;
		return getAns(i+1,j,m,n)+getAns(i,j+1,m,n);
	}
	public static int getAnsUsingDP(int i, int j,int m, int n,int[][] dp) {
		// Write your code here.
		if(i==m-1 || j==n-1) return 1;
		if(i>=m || j>=n) return 0;
		if(dp[i][j]!=0) return dp[i][j];
		int left= getAns(i+1,j,m,n);
		int right=getAns(i,j+1,m,n);
		dp[i+1][j]=left;
		dp[i][j+1]=right;
		return left+right;
	}

}
