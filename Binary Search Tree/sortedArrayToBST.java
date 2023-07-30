import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the TreeNode class:

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


*****************************************************************/

import java.util.ArrayList;

public class Solution {
    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        // Write your code here.
        if(n==0) return null;
        return bst(arr,0,n-1);
    }
public static TreeNode<Integer> bst(ArrayList<Integer> arr, int l, int r) {
        // Write your code here.
        if(l>r) return null;
        int mid = l+(r-l)/2;
        TreeNode<Integer> node = new TreeNode<Integer>(arr.get(mid));
        node.left = bst(arr,l,mid-1);
        node.right = bst(arr,mid+1,r);
        return node;
    }

}