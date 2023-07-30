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
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  inorder, ArrayList<Integer>  preorder) 
    {
        //    Write your code here.
        HashMap<Integer,Integer> hp = new HashMap<>();
        for (int index = 0; index < inorder.size(); index++) {
            hp.put(inorder.get(index),index);
        }

        return buildBT(inorder,0,inorder.size()-1,preorder,0,preorder.size()-1,hp);
    }

    public static TreeNode<Integer> buildBT(ArrayList<Integer>  inorder,int inStart, int inEnd, ArrayList<Integer>  preorder, int preStart, int preEnd,HashMap<Integer,Integer> hp){
        if(inStart>inEnd || preStart>preEnd) return null;

        TreeNode<Integer> root = new TreeNode(preorder.get(preStart));

        int rootIdxInorder = hp.get(preorder.get(preStart));
        int numElementsLeft = rootIdxInorder - inStart;

        root.left = buildBT(inorder, inStart, rootIdxInorder-1, preorder, preStart+1, preStart+numElementsLeft, hp);
        root.right = buildBT(inorder, rootIdxInorder+1, inEnd, preorder, preStart+numElementsLeft+1,preEnd, hp);
        return root;
    }
}