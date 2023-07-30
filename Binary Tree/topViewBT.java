import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/

public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		// Write your code here.
		ArrayList<Integer> res = new ArrayList<>();
		 if(root == null) return res;
		TreeMap<Integer,Integer> hp = new TreeMap<>();
		Queue<Pair> q = new LinkedList<>();
		q.offer(new Pair(0,root));

		while (!q.isEmpty()) {
			int size=q.size();
			for (int index = 0; index < size; index++) {
				if(hp.get(q.peek().line)==null) hp.put(q.peek().line, q.peek().node.val);
				if(q.peek().node.left!=null) q.offer(new Pair(q.peek().line-1, q.peek().node.left));
				if(q.peek().node.right!=null) q.offer(new Pair(q.peek().line+1, q.peek().node.right));
				q.poll();
			}
		}

		for(int val:hp.values()){
			res.add(val);
		}
		return res;
	}
}

class Pair{
	int line;
	BinaryTreeNode node;

	Pair(int line,BinaryTreeNode node){
		this.line=line;
		this.node=node;
	}
}