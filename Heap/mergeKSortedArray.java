import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static class Pair implements Comparable<Pair>{
		int listIdx;
		int kthListIdx;
		int data;
		
		Pair(int li, int ki,int d){
			this.listIdx=li;
			this.kthListIdx=ki;
			this.data=d;
		}
		
		public int compareTo(Pair p){
			return this.data-p.data;
		}
	}
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.`
		
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i < kArrays.size(); i++) {
			Pair p = new Pair(i, 0,kArrays.get(i).get(0));
			pq.add(p);
		}
		
		while (!pq.isEmpty()) {
			Pair p = pq.poll();
			res.add(p.data);
			p.kthListIdx++;
			
			if(p.kthListIdx<kArrays.get(p.listIdx).size()){
				p.data = kArrays.get(p.listIdx).get(p.kthListIdx);
				pq.add(p);
			}
		}
		return res;
	}
}
