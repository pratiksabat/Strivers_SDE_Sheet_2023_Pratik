import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
		// return findRepeating(ArrayList<Integer> arr, int n);
	int[] vis = new int[n+1];
	int[] res = new int[2];
	res[0]=-1;
	res[1]=-1;
	for(int i=0;i<n;i++){
		if(vis[arr.get(i)]==-1){
			res[1]=arr.get(i);
		}else vis[arr.get(i)]=-1;
	}
	
	for(int i=1;i<n+1;i++)
	{
		if(vis[i]!=-1){
			res[0]=i;
		}
	}
	return res;
    }
}
