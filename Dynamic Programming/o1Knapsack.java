import java.util.ArrayList;

public class Solution {
	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
	
	// Write your code here.
	int prev[]=new int[w+1];
    
    //Base Condition
    
    for(int i=weights.get(0); i<=w; i++){
        prev[i] = values.get(0);
    }
    
    for(int ind =1; ind<n; ind++){
        for(int cap=w; cap>=0; cap--){
            
            int notTaken = 0 + prev[cap];
            
            int taken = Integer.MIN_VALUE;
            if(weights.get(ind) <= cap)
                taken = values.get(ind) + prev[cap - weights.get(ind)];
                
            prev[cap] = Math.max(notTaken, taken);
        }
    }
    
    return prev[w];
	}
}