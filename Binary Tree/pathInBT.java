import java.util.* ;
import java.io.*; 
/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/

public class Solution {
    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root==null) return res;

        solve(res,root,x);
        return res;
    }

    public static boolean solve(ArrayList<Integer> res, TreeNode node, int x){
        if(node==null) return false;
        if(node.data==x){
            res.add(x);
            return true;
        }else{
            res.add(node.data);
            boolean left = solve(res, node.left, x);
            boolean right = solve(res, node.right, x);
            if(left == false && right==false){
                res.remove(res.size()-1);
                return false;
            }
            return left || right;
        }
    }
}