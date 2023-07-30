public class Solution {
	public static int cutRod(int price[], int N) {
		// Write your code here.
		  int cur[]=new int[N+1];
    
    for(int i=0; i<=N; i++){
        cur[i] = i*price[0];
    }
    
    for(int ind=1; ind<N; ind++){
        for(int length =0; length<=N; length++){
        
             int notTaken = 0 + cur[length];
    
             int taken = Integer.MIN_VALUE;
             int rodLength = ind+1;
             if(rodLength <= length)
                taken = price[ind] + cur[length-rodLength];
        
             cur[length] = Math.max(notTaken,taken);   
        }
    }
    
    return cur[N];
	}
}