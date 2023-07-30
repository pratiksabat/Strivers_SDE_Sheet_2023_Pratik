import java.util.* ;

import java.io.*; 
 
 
/*************************************************************
	Following is the Binary Tree node structure
	class TreeNode<T> {
		public T data;
		public TreeNode<T> left;
		public TreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = right = null;
		}

};************************************************************/
public class Solution {
 
	public static TreeNode<Integer> preOrderTree(int[] preOrder) {
 		// Write your code here
		if(preOrder.length==0) return null;
		return bst(preOrder,Integer.MAX_VALUE,new int[]{0});
	}
	public static TreeNode<Integer> bst(int[] preOrder, int bound,int[] pointer) {
		if(pointer[0]==preOrder.length || preOrder[pointer[0]]>bound) return null;
		TreeNode<Integer> node = new TreeNode(preOrder[pointer[0]++]);
		node.left = bst(preOrder, node.data, pointer);
		node.right = bst(preOrder, bound, pointer);
		return node;
	}


}
