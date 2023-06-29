import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		int[] nge = new int[n];
		Stack<Integer> st = new Stack<>();

		for (int i = n-1; i >=0; i--) {
			
			while (!st.isEmpty() && st.peek()<=arr[i]) {
				st.pop();
			}

			if(i<n){
				if(!st.isEmpty()) nge[i]=st.peek();
				else nge[i]=-1;
			}
			st.push(arr[i]);
		}

		return nge;


	}

}
