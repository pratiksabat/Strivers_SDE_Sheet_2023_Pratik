import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		HashMap<Integer,Integer> hp = new HashMap<>();
		for(int ele:arr)
			hp.put(ele,hp.getOrDefault(ele,0)+1);

		for(Map.Entry<Integer,Integer> it: hp.entrySet()){
			if(it.getValue()>n/2) return it.getKey();
		}

		return -1;
	}
}
