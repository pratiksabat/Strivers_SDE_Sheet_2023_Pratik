import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	   }
	}


************************************************************/

public class Solution {
	public static int getMaxWidth(TreeNode root) {
		// Write your code here.
		if(root==null) return 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int idx=0;

		while (!q.isEmpty()) {
			int size=q.size();

			for (int i = 0; i < size; i++) {
				TreeNode node = q.poll();

				if(node.left!=null) q.offer(node.left);
				if(node.right!=null) q.offer(node.right);
			}

			idx=Math.max(idx,size);
		}
		return idx;
	}
}
