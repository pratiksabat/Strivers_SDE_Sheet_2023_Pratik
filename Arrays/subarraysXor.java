import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		HashMap<Integer,Integer> hs =new HashMap<>();
		// int maxi=0;
		// int res=0;

		// for (int index = 0; index < arr.size(); index++) {
		// 	res=res^arr.get(index);
		// 	if(res==x){
		// 		maxi=index+1;
			
		// 	}else{
		// 		if(hp.get(res)!=null){
		// 			maxi=Math.max(maxi,index-hp.get(res));
		// 		}else{
		// 			hp.put(res,index);
		// 		}
		// 	}
		// }
		// return maxi;
		hs.put(0,1);
		int xor=0;
		int c=0;

		for (int index = 0; index < arr.size(); index++) {
			xor^=arr.get(index);

			int tot=xor^x;
			if(hs.containsKey(tot)){
				c+=hs.get(tot);
			}

			hs.put(xor,hs.getOrDefault(xor, 0)+1);
		}

		return c;
	}
}
