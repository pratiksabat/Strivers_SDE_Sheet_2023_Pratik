import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		ArrayList<Integer> res = new ArrayList<>();
		int small = getKthSmallest(arr,n,k);
		int large = getKthLargest(arr,n,k);
		res.add(large);
		res.add(small);
		return res;
	}

	public static int getKthLargest(ArrayList<Integer> arr, int n, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (Integer it : arr) {
			pq.add(it);
		}

		while (k>1) {
			pq.poll();
			k--;
		}

		return pq.peek();
	}
	public static int getKthSmallest(ArrayList<Integer> arr, int n, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (Integer it : arr) {
			pq.add(it);
		}

		while (k>1) {
			pq.poll();
			k--;
		}

		return pq.peek();
	}
}
