import java.util.*;
public class Solution {

	public static int longestIncreasingSubsequence(int arr[]) {
		//Your code goes here
		int n = arr.length;
        List<Integer> lis = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(lis.isEmpty() || arr[i] > lis.get(lis.size()-1)){
                lis.add(arr[i]);
            }
            else{
                int possiblePos = Collections.binarySearch(lis, arr[i]);
                //its repeat , we want strictly increasing
                if(possiblePos >=0){
                    continue;
                }
                else{
                    int insertPos = -possiblePos -1;
                    lis.set(insertPos,arr[i]);
                }
            }

        }
        
        return lis.size();
	}

}