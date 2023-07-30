import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode < Integer > {
        int data;
        BinaryTreeNode < Integer > left;
        BinaryTreeNode < Integer > right;

    public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

*************************************************************/

public class Solution {
    public static void changeTree(BinaryTreeNode < Integer > root) {
        // Write your code here.
        if(root==null) return;
        int tot=0;
        if(root.left!=null) tot+=root.left.data;
        if(root.right!=null) tot+=root.right.data;

            if (tot>=root.data ) {
                root.data=tot;
            } else {
                if(root.left!=null) root.left.data=root.data;
                else if(root.right!=null) root.right.data=root.data;  
            }
        
        changeTree(root.left);
        changeTree(root.right);

        int tot1=0;
        if(root.left!=null) tot1+=root.left.data;
        if(root.right!=null) tot1+=root.right.data;
        if(root.left!=null || root.right!=null) root.data = tot1;

    }

}