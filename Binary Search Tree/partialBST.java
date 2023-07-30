import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

 *************************************************************/

public class Solution {
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        // Write your code here
    return bst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean bst(BinaryTreeNode<Integer> root, int min, int max){
        if(root==null) return true;

        if(root.data>max || root.data<min) return false;
    return bst(root.left,min,root.data) && bst(root.right,root.data,max);
    }
}
