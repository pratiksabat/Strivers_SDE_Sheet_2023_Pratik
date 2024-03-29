import java.util.* ;
import java.io.*; 
/*

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

*/

public class Solution 
{

	public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) 
    {		
        // Write your code here
        if(root==null) return root;
        // if(root.left.data==p.data && root.right.data==q.data) return root;

        if(root.data>p.data && root.data>q.data) return LCAinaBST(root.left, p, q);
        if(root.data<p.data && root.data<q.data) return LCAinaBST(root.right, p, q);
        return root;
	}
}