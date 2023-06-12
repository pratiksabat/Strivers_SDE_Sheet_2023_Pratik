import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int c=0;
        for(int i=0;i<arr.size();i++){
			for (int j = i+1; j < arr.size(); j++) {
				if(i<j&&(arr.get(i)>2*arr.get(j)))c++;	
			}
		}
        return c;
    }
}
