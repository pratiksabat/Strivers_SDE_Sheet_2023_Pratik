import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
		int n=arr.size();
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for (int i = 0; i < (1 << n); i++) {
			ArrayList<Integer> sub = new ArrayList<>();
			for (int j = 0; j <n; j++) {
				if((i&(1<<j))!=0){
					sub.add(arr.get(j));
				}
			}
			res.add(sub);
		}

		return res;
	}
}

