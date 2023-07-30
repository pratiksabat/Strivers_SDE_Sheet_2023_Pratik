import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/

public class Solution {
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
		List<List<Integer>> res = new ArrayList<>();
		if(root==null) return res;
		ArrayList<Integer> in = new ArrayList<>();
		ArrayList<Integer> pre = new ArrayList<>();
		ArrayList<Integer> post = new ArrayList<>();

		inorder(root, in);
		preorder(root, pre);
		postorder(root, post);

		res.add(in);
		res.add(pre);
		res.add(post);

		return res;
    }

	public static void inorder(BinaryTreeNode<Integer> root, ArrayList<Integer> li){
		if(root==null) return;
		inorder(root.left, li);
		li.add(root.data);
		inorder(root.right, li);
	}
	public static void preorder(BinaryTreeNode<Integer> root, ArrayList<Integer> li){
		if(root==null) return;
		li.add(root.data);
		preorder(root.left, li);
		preorder(root.right, li);
	}
	public static void postorder(BinaryTreeNode<Integer> root, ArrayList<Integer> li){
		if(root==null) return;
		postorder(root.left, li);
		postorder(root.right, li);
		li.add(root.data);
	}
}
