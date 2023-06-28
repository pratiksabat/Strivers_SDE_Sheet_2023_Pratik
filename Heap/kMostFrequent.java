import java.util.* ;
import java.io.*; 
public class Solution {

	public static class Pair implements Comparable<Pair>{
		int ele;
		int count;

		Pair(int ele,int count){
			this.ele=ele;
			this.count=count;
		}

		public int compareTo(Pair p){
			return p.count-this.count;
		}

	}
	public static int[] KMostFrequent(int n, int k, int[] arr) {
		// Write your code here.
		HashMap<Integer,Integer> hp = new HashMap<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>();

		for (int it : arr) {
			hp.put(it,hp.getOrDefault(it, 0)+1);
		}

		for(Map.Entry<Integer,Integer> mp:hp.entrySet()){
			pq.add(new Pair(mp.getKey(), mp.getValue()));
		}
		int[] res = new int[k];
		int c=0;
		while(k-->0){
			Pair a = pq.poll();
			res[c++]=a.ele;
		}
		return res;
	}

}
