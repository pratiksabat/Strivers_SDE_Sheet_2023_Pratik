import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
         boolean[][] dp = new boolean[n+1][k+1];
        for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<k+1;j++){
                int num = arr[i-1];
                //Remaining sum and remaining digits can add upto k
                if(num<=j && dp[i-1][j-num]){
                    dp[i][j] = true;
                }
                //Current element is not taken and previous calc is checked
                else if(dp[i-1][j]){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][k];
    }
}
