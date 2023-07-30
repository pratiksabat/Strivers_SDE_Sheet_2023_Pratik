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

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        ArrayList <Integer> res = new ArrayList<Integer>();
        solve(res,root,0);
        return res;
    }

    public static void solve(ArrayList<Integer> res,TreeNode<Integer> root, int level){
        if(root==null) return;
        if(level==res.size()) res.add(root.data);
        solve(res,root.left,level+1);
        solve(res,root.right,level+1);
    }
}
