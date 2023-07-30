import java.util.ArrayList;
public class Solution {
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    // Write your code here.
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      adj.add(new ArrayList<>());
    }
    for (ArrayList<Integer> it : edges) {
      int u = it.get(0);
      int v = it.get(1);
      adj.get(u).add(v);
      // adj.get(v).add(u);
    } 
    boolean[] vis = new boolean[n+1];
    boolean[] path = new boolean[n+1];

    for (int index = 1; index <=n; index++) {
      if(!vis[index]){
      if(dfs(adj,vis,path,index)==true) return true;
      }
    }

    return false;
  }

  public static boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] path, int node){
    vis[node]=true;
    path[node]=true;

    for (Integer ele : adj.get(node)){

        if(!vis[ele]){
          if(dfs(adj, vis, path, ele)==true) return true;
        }else if(path[ele]==true) return true;
    }



    path[node]=false;
    return false;
  }
}