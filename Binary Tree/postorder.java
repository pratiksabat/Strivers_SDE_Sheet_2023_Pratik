import java.util.* ;
import java.io.*; 
/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        solve(res,root);
        return res;
    }

    public static void solve(List<Integer> res,TreeNode root){
        if(root==null) return;
        solve(res,root.left);
        solve(res,root.right);
        res.add(root.data);
    }
}