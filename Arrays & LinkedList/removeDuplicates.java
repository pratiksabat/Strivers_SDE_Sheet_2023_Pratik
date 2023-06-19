import java.util.ArrayList;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int len=1;
		for (int i = 1; i < n; i++) {
			if(arr.get(i-1).equals(arr.get(i))) continue;
			else len++;
		}
		return len;
	}
}