import java.util.HashMap;

/************************************************************
  
   Following is the TreeNode class structure
   
   class TreeNode<T> { 
        T data; 
        TreeNode<T> left;
        TreeNode<T> right;
  
        TreeNode(T data) { 
            this.data = data; 
            left = null; 
            right = null; 
        }
   }
    
 ************************************************************/

public class Solution {
	public static TreeNode<Integer> getTreeFromPostorderAndInorder(int[] postOrder, int[] inOrder) {
		// Write your code here.
    if(inOrder == null || postOrder == null || inOrder.length != postOrder.length) return null;
    HashMap<Integer,Integer> hp = new HashMap<>();
    for (int i = 0; i < inOrder.length; i++) {
      hp.put(inOrder[i], i);
    }
    TreeNode<Integer> root = getTree(postOrder,0,postOrder.length-1,inOrder,0,inOrder.length-1,hp);
    return root;
    }
  public static TreeNode<Integer> getTree(int[] postOrder, int postStart,int postEnd,int[] inOrder,int inStart,int inEnd, HashMap<Integer,Integer> hp){
    if(postStart>postEnd || inStart>inEnd) return null;
    TreeNode<Integer> root = new TreeNode(postOrder[postEnd]);
    // int rootIdx = postOrder[postEnd];
    int foundAt = hp.get(postOrder[postEnd]);
    int numLeft = foundAt-inStart;
    root.left = getTree(postOrder,postStart,postStart+numLeft-1,inOrder,inStart,foundAt-1,hp);
    root.right = getTree(postOrder,postStart+numLeft,postEnd-1,inOrder,foundAt+1,inEnd,hp);
    return root;
  }

}
