import java.util.* ;
import java.io.*; 
/*
    Definition of Node class for reference

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

*/
public class Solution {

    static class BSTIterator{

        Stack<TreeNode<Integer>> st = new Stack<TreeNode<Integer>>();

        BSTIterator(TreeNode<Integer> root){
            // Write your code here
            pushAll(root);
        }

        int next(){
            if(st.isEmpty()) return -1;
             TreeNode<Integer> curr =  st.pop();
              pushAll(curr.right);
             return curr.data;
            // Write your code here
        }

        boolean hasNext(){
            return !st.isEmpty();
            // Write your code here
        }

        void pushAll(TreeNode<Integer> temp){
            while (temp!=null) {
                 st.add(temp);
                 temp=temp.left;
             }
        }
    }
}

/*
    Your BSTIterator object will be instantiated and called as such:
    BSTIterator iterator = new BSTIterator(root);
    while(iterator.hasNext())
    {
       print(iterator.next()+" ");
    }
*/
