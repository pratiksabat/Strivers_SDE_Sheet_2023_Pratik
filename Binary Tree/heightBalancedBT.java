import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the Binary Tree node structure

class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

*************************************************************/
public class Solution {

	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		// Write your code here.
        if(root==null) return true;        
        return solve(root)!=-1;
	}

    public static int solve(BinaryTreeNode<Integer> node){
        if(node==null) return 0;
        int lh = solve(node.left);
        if(lh==-1) return -1;
        int rh = solve(node.right);
        if(rh==-1) return -1;
        if(Math.abs(rh-lh)>1){
            return -1;    
        }
        return 1+Math.max(lh, rh);
    }

}
