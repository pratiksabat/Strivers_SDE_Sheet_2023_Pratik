import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        // Write your code here.
		HashMap<Integer,Integer> hp = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int ele:arr)
			hp.put(ele,hp.getOrDefault(ele,0)+1);

		for(Map.Entry<Integer,Integer> it: hp.entrySet()){
			if(it.getValue()>Math.floor(arr.size()/3)) ans.add(it.getKey());
		}

		return ans;
    }
}
