import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        // for (int index = 0; index < edges.length; index++) {
        //     res.add(new ArrayList<Integer>());
        // }
        ArrayList<ArrayList<Integer>> adj = constructAdjList(v, edges);
        int[] vis = new int[v];
        for (int i = 0; i < v; i++) {
            if(vis[i]!=1){
                ArrayList<Integer> sb = new ArrayList<>();
                dfs(adj,i,sb,vis);
                res.add(sb);
            }
        }
        return res;
    }

    public static ArrayList<ArrayList<Integer>> constructAdjList(int V, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int index = 0; index < V; index++) {
            adj.add(new ArrayList<>());
        }

        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u); // For an undirected graph, add both directions
        }

        return adj;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int node, ArrayList<Integer> res, int[] vis){
        vis[node]=1;
        res.add(node);

        for (Integer it : adj.get(node)) {
            if(vis[it]!=1){
                dfs(adj,it,res,vis);
            }
        }

    }
}