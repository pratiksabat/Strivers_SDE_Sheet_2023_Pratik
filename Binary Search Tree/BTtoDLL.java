import java.util.* ;
import java.io.*; 

/*************************************************************
 class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

*************************************************************/


public class Solution {
	static BinaryTreeNode<Integer> prev,head;

	public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
		// Write your code here
		// BinaryTreeNode<Integer> dummy = root;
		prev=null;
		head=null;
		dll(root);
		return head;
	}

	public static void dll(BinaryTreeNode<Integer> root){
		if(root==null) return;
		dll(root.left);
		if(prev==null) head=root;
		else{
			prev.right=root;
			root.left=prev;
		}
		prev=root;
		dll(root.right);
	}
	

}