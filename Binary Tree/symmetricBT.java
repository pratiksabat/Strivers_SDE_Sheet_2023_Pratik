/*****************************************************************

    Following is the representation for the Binary Tree Node:

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

****************************************************************/

public class Solution {

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        // Write your code here.
        return root==null || checkSYmetric(root.left,root.right);
    }

    public static boolean checkSYmetric(BinaryTreeNode<Integer> left,BinaryTreeNode<Integer> right){
        if(left==null || right==null) return left==right;

        if(!left.data.equals(right.data)) return false;

        return checkSYmetric(left.left,right.right) && checkSYmetric(left.right,right.left);
    }
}