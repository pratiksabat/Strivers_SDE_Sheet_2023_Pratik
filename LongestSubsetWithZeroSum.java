import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
	HashMap<Integer,Integer> hp = new HashMap<>();
	int max=0;
	int sum=0;
	for (int index = 0; index < arr.size(); index++) {
		sum+=arr.get(index);
		if(sum==0){
			max=index+1;
		}else{
			if(hp.get(sum)!=null){
				max=Math.max(max, index-hp.get(sum));
			}else{
				hp.put(sum, index);
			}
		}
	}
	return max;
	}
}
