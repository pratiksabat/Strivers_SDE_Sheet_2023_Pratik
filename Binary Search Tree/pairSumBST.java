import java.util.* ;
import java.io.*; 
/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/

public class Solution {
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.
		if(root==null) return false;
		BSTIterator l = new BSTIterator(root, false);
		BSTIterator r = new BSTIterator(root, true);
		int i= l.next();
		int j=r.next();
		while (i<j) {
			if(i+j==k) return true;
			else if(i+j>k) r.next();
			else l.next();
		}
		return false;
	}

	// public static void inOrder(BinaryTreeNode root,ArrayList<Integer> arr){
	// 	if(root==null) return;
	// 	inOrder(root.left, arr);
	// 	arr.add(root.data);
	// 	inOrder(root.right, arr);
	// }

	// public static boolean pairSum(ArrayList<Integer> arr,int l, int r, int k){
	// 	while (l<r) {
	// 		if(arr.get(l)+arr.get(r)==k) return true;
	// 		if(arr.get(l)+arr.get(r)>k) r--;
	// 		else l++;
	// 	}
	// 	return false;
	// }
}

 class BSTIterator{
	 Stack<BinaryTreeNode> st = new Stack<>();
	 boolean reverse=true;

	 BSTIterator(BinaryTreeNode node, boolean reverse){
		 reverse=reverse;
		 pushAll(node);
	 }

	 void pushAll(BinaryTreeNode node){
		 while (node!=null) {
			 st.add(node);
			 if(reverse==false) node=node.left;
			 else node=node.right;
		 }
	 }

	 int next(){
		 BinaryTreeNode node = st.pop();
		 if(reverse==true) pushAll(node.left);
			 else pushAll(node.right);
		return node.data;
	 }

	 boolean hasNext(){
		 return !st.isEmpty();
	 }
}

