import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/


public class Solution 
{

	static int ans = -1;
	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//  Write your code here.
		ArrayList<Integer> res = new ArrayList<>();
		rec(root,k,res);
		return res.get(k-1);
	}
	public static void rec(TreeNode<Integer> root, int k,ArrayList<Integer> res) 
	{
		//  Write your code here.
		if(root==null || res.size()>=k) return;

		rec(root.left, k,res);
    	res.add(root.data);
		rec(root.right, k,res);
		// return ans;
	}


}
