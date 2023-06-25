import java.util.* ;
import java.io.*; 

public class Solution {

	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// Write your code here.
		ArrayList<String> res = new ArrayList<>();
		HashSet<String> dict = new HashSet<>(dictionary); // Convert given list dict to hashset for O(1) lookup
		solve(s,0,"",dict,res);
		return res;
	}

	public static void solve(String s, int idx, String sub,HashSet<String> dictionary,ArrayList<String> res){
		if(idx==s.length()){
			res.add(sub);
			return;
		}

		for(int i=idx;i<s.length();i++){
			if(isPresent(s.substring(idx,i+1),dictionary)){
				solve(s, i+1, sub+(s.substring(idx,i+1)+" "), dictionary, res);
			}
		}
	}

	public static boolean isPresent(String s,HashSet<String> dictionary){
		return dictionary.contains(s);
	}

}