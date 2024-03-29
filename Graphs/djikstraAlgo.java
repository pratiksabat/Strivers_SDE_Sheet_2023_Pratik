import java.util.*;
public class Solution {
	
	public static ArrayList < Integer > dijkstra(ArrayList< ArrayList < Integer > > vec, int vertices, int edges, int source){
		// Write your code here.
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0; i<vertices; i++) adj.add(new ArrayList<int[]>());
        
        //creating graph
        for(int i=0; i<edges; i++)
        {
            int u = vec.get(i).get(0);
            int v = vec.get(i).get(1);
            int w = vec.get(i).get(2);
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
            
        }
        //filled distance array with maximum distance
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        //pushed source node with distance 0.
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        q.add(new int[]{0, 0});
        distance[0] = 0;
        while(!q.isEmpty())
        {
            int dist = q.peek()[0];
            int node = q.poll()[1];
            
            for(int[] adjacentNode : adj.get(node))
            {
                if(dist + adjacentNode[1] < distance[adjacentNode[0]])
                {
                    distance[adjacentNode[0]] = dist + adjacentNode[1];
                    q.add(new int[]{distance[adjacentNode[0]], adjacentNode[0]});
                }
            }
        }
        ArrayList<Integer> dist = new ArrayList<>();
        for(int x : distance) dist.add(x);
        return dist;
	}
}