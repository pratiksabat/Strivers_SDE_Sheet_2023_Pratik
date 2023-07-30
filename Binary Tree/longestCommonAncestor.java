import java.util.* ;
import java.io.*; 
/************************************************************

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

************************************************************/

public class Solution 
{
    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) 
    {
        //    Write your code here.
        if(root==null) return -1;
        TreeNode<Integer> res = solve(root,x,y);
        return res.data;
    }

    public static TreeNode<Integer> solve(TreeNode<Integer> root, int x, int y){
        if(root==null || root.data==x || root.data==y){
            return root;
        }
        TreeNode<Integer> left = solve(root.left,x,y);
        TreeNode<Integer> right = solve(root.right,x,y);

        if(left==null) return right;
        else if(right==null) return left;
        else return root;
    }
}
