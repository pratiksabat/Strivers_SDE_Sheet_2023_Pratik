import java.util.* ;
import java.io.*; 
public class Solution {
    static int bellmonFord(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
      // Write your code here.
       int[] dist = new int[n+1];

      Arrays.fill(dist, (int)1e9);

      dist[src] = 0;

 

      for(int i=0; i<n-1; i++){

        for(ArrayList<Integer> e: edges){

          int u = e.get(0);

          int v = e.get(1);

          int wt = e.get(2);

 

          if(dist[u] != (int)1e9 && dist[u] + wt < dist[v]){

            dist[v] = dist[u] + wt;

          }

        }

      }

 

      return dist[dest];
    }
    
}
