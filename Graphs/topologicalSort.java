import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int index = 0; index < v; index++) {
            adj.add(new ArrayList<>());
        }

        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int l = edge.get(1);
            adj.get(u).add(l);
        }
        int[] vis = new int[v];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < v; i++) {
            if(vis[i]!=1){
                dfs(i,adj,st,vis);
            }    
        }

        ArrayList<Integer> arr = new ArrayList<>();
        while (!st.isEmpty()) {
            arr.add(st.pop());
        }

        return arr;
    }

    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st,int[] vis){
        vis[node]=1;

        for (Integer it : adj.get(node)) {
            if(vis[it]!=1){
                dfs(it, adj, st, vis);
            }
        }

        st.add(node);
    }
}
