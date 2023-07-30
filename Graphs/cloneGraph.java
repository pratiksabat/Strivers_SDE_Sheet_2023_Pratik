import java.util.* ;
import java.io.*; 
/***************************************************************************

  Class for graph node is as follows:

  class graphNode {
      public int data;
      public ArrayList<graphNode> neighbours;

      graphNode() {
          data = 0;
          neighbours = new ArrayList<graphNode>();
      }

      graphNode(int val) {
          data = val;
          neighbours = new ArrayList<graphNode>();
      }

      graphNode(int val, ArrayList<graphNode> neighbours) {
          data = val;
          this.neighbours = neighbours;
      }
    }

******************************************************************************/

public class Solution {
    // public static graphNode cloneGraph(graphNode node) {
    //     // Write your code here.
    //     if(node==null) return node;
    //     if(node.neighbours.size()==0){
    //         graphNode g = new graphNode(node.val);
    //         return g;
    //     }
    //     HashMap<graphNode,graphNode> hp = new HashMap<>();
    //     return dfs(node,hp);
    // }

    // public static graphNode dfs(graphNode node,HashMap<graphNode,graphNode> hp){
    //     ArrayList<graphNode> neighbours = new ArrayList<>();
    //     graphNode cl = new graphNode(node.val);
    //     hp.put(node,cl);
    //     for (graphNode g : node.neighbours) {
    //         if(hp.contains(g)){
    //             neighbours.add(hp.get(g));
    //         }else{
    //             neighbours.add(dfs(g,hp));
    //         }
    //     }
    //     cl.neighbours = neighbours;
    //     return cl;
    // }
    public static graphNode cloneGraph(graphNode node) {

       for(graphNode child:node.neighbours)
           cloneGraph(child);

       graphNode cloneNode=new graphNode(node.data,new java.util.ArrayList(node.neighbours));

       return cloneNode;

   }

}
}