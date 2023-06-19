import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
		int l=0,r=0;
		int zero_count=0;
		int ans=Integer.MIN_VALUE;

		while(r<n){
			if(arr.get(r)==0){
				zero_count++;
			}

			while(zero_count>k) {
				if(arr.get(l)==0){
					zero_count--;
				}
				l++;
			}

			ans=Math.max(ans, r-l+1);
			r++;
		}
		return ans;
	}
}