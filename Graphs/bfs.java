import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> BFS(int vertex, int edges[][]){
		// WRITE YOUR CODE HERE
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<vertex; i++) adj.add(new ArrayList());
        
        for(int i=0; i<edges[0].length; i++)
        {
            adj.get(edges[0][i]).add(edges[1][i]);
            adj.get(edges[1][i]).add(edges[0][i]);            
        }
        
       	for(int i=0; i<vertex; i++) Collections.sort(adj.get(i));
		
		ArrayList<Integer> bfs = new ArrayList<>();
		int[] vis = new int[vertex];
		for (int i = 0; i < vertex; i++) {
            if (vis[i]!=1) {
                performBFS(adj, vis, bfs, i);
            }
        }
		return bfs;
	}

	public static void performBFS(ArrayList<ArrayList<Integer>> adj,int[] vis,ArrayList<Integer> bfs, int idx){
		Queue<Integer> q = new LinkedList<>();
		vis[idx]=1;
		q.add(idx);

		while (!q.isEmpty()) {
			Integer ele = q.poll();
			// vis[ele]=1
			bfs.add(ele);

			for (int n : adj.get(ele)) {
				if(vis[n]!=1){
					vis[n]=1;
					q.add(n);
				}
			}
		}
	}
}

