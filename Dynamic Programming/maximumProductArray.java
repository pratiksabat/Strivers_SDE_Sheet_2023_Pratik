import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int pre=1,suf=1;
		int ans = Integer.MIN_VALUE;

		for (int index = 0; index < arr.size(); index++) {
			if(pre==0) pre=1;
			if(suf==0) suf=1;

			pre=pre*arr.get(index);
			suf=suf*arr.get(n-index-1);
			ans=Math.max(ans, Math.max(pre, suf));
		}

		return ans;
	}
}