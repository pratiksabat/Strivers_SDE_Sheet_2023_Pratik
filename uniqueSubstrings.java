import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
		HashMap<Character,Integer> hp =new HashMap<>();
		int l=0,r=0;
		int max=0;
		int size=input.length();

		while (r<size) {
			
			if(hp.containsKey(input.charAt(r)))
				l=Math.max(hp.get(input.charAt(r))+1,l);

			hp.put(input.charAt(r), r);
			max=Math.max(max,r-l+1);
			r++;
		}

		return max;
		
	}
}
