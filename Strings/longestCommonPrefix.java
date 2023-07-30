
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
		String longest="";
		for(int i=0;i<arr[0].length();i++){
			for(int j=1;j<n;j++){
				if(i>=arr[j].length() || arr[0].charAt(i)!=arr[j].charAt(i))
					return longest;
			}
			longest+=(arr[0].charAt(i)+"");
		}
		return longest;
	}

}
