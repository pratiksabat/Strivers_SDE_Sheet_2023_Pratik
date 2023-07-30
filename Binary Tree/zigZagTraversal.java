import java.util.*;
import java.io.*;
/*
	Following is the class used to represent the object/node of the Binary Tree

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}
*/

public class Solution {
	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		// Write your code here!
		List<Integer> res = new ArrayList<>();
		if (root == null)
			return res;

		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.add(root);
		// res.add(root.data);
		int level = 0;
		while (!q.isEmpty()) {
			int s = q.size();
			List<Integer> sub = new ArrayList<>();
			// if(level%2==0){
			for (int i = 0; i < s; i++) {
				BinaryTreeNode<Integer> node = q.poll();
				sub.add(node.data);
				if (node.left != null)
					q.offer(node.left);
				if (node.right != null)
					q.offer(node.right);
			}
			if (level % 2 != 0) {
				Collections.reverse(sub);
			}
			for (Integer in : sub) {
				res.add(in);
			}
			level++;
		}
		return res;
	}
}
