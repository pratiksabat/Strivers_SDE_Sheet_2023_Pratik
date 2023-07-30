/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Solution {
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
		// if(root==null) return 0;
		int[] diameter = new int[1];
		solve(root,diameter);
		return diameter[0];
	}
	public static int solve(TreeNode<Integer> root,int[] d){
		if(root==null) return 0;

		int lh = solve(root.left,d);
		int rh = solve(root.right,d);
		d[0]=Math.max(d[0],lh+rh);
		return 1+Math.max(lh,rh);

	}

}