import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
        // BRUTE FORCE APPROACH
		// ArrayList<Integer> arr = new ArrayList<>();
		// for (ArrayList<Integer> it : matrix) {
		// 	arr.addAll(it);
		// }
		// Collections.sort(arr);
		// return arr.get(arr.size()/2);

        // OPTIMISED USING BS with ANSWERS Approach
		int l=0,r=1000000000;

		while (l<=r) {
			int m = l+(r-l)/2;
			int count=0;
			for (int index = 0; index < matrix.size(); index++) {
				count+=findNoOfElementsLessOrEqualToMid(matrix.get(index),m);
			}

			if(count<=(matrix.size()*matrix.get(0).size()/2)){
				l=m+1;
			}else r=m-1;
		}

		return l;
	}

	public static int findNoOfElementsLessOrEqualToMid(ArrayList<Integer> arr, int ele){
		int l=0,r=arr.size()-1;

		while (l<=r) {
			int m = l+(r-l)/2;
			if(arr.get(m)<=ele){
				l=m+1;
			}else r=m-1;
		}
		return l;
	}
}