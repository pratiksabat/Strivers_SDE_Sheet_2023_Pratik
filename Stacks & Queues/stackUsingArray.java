import java.util.* ;
import java.io.*; 

public class Stack {

    int[] stack;
    int idx;

    Stack(int size){
        this.stack = new int[size];
        this.idx=0;
    }
    void push(int num) {
        // Write your code here.
            stack[idx]=num;
            idx++;
    }
    int pop() {
        // Write your code here.
        // System.out.println("IDx val = "+idx);
        // idx--;
        if(isEmpty()==1) return -1;
        int ele = stack[idx-1];
        stack[idx-1]=0;
        idx--;
        return ele;
    }
    int top() {
        // Write your code here.
        if(idx==0) return -1;

        return stack[idx-1];
    }
    int isEmpty() {
        // Write your code here.
        return idx==0?1:0;
    }
    int isFull() {
        // Write your code here.
        return idx==stack.length?1:0;
    }
}
