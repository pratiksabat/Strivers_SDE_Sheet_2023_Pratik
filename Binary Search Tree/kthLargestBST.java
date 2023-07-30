import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the Binary Search Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.ArrayList;

public class Solution {
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		int[] ans = { -1 };
        rec(root, new int[]{k}, ans);
        return ans[0];
	}

	private static void rec(TreeNode<Integer> root, int[] k, int[] ans) {
        if (root == null)
            return;

        rec(root.right, k, ans);
        k[0]--;

        if (k[0] == 0) {
            ans[0] = root.data;
            return;
        }

        rec(root.left, k, ans);
    }
}