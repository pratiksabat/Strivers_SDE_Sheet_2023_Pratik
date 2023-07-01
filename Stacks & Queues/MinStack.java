import java.util.* ;
import java.io.*;

public class Solution {

    static class MinStack {

        Stack<Pair> st;
        // Constructor
        MinStack() {
            // Write your code here.
            st= new Stack<Pair>();
        }

        // Function to add another element estual to num at the top of stack.
        void push(int num) {
            if(st.isEmpty()){
                st.push(new Pair(num, num));
            }else{
                st.push(new Pair(num, Math.min(num,st.peek().min)));
            }
        }

        // Function to remove the top element of the stack.
        int pop() {
            // Write your code here.
            if(st.isEmpty()) return -1;
            Pair p=st.pop();
            return p.val;
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            // Write your code here.
            if(st.isEmpty()) return -1;
            return st.peek().val;
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            // Write your code here.
            if(st.isEmpty()) return -1;

            return st.peek().min;
        }
    }

}
class Pair{
    int val,min;

    Pair(int v, int m){
        this.val=v;
        this.min=m;
    }
}