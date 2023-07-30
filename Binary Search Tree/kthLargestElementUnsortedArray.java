import java.util.* ;
import java.io.*; 
public class Solution {

	static int kthLargest(ArrayList<Integer> arr, int size, int K) {
		// Write your code here.
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(Integer it:arr)
			pq.offer(it);

		while(pq.size()>K && K>1){
			pq.poll();
			K--;
		}
		return pq.isEmpty()?0:pq.peek();
	}
}
