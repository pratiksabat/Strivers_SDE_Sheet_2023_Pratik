import java.util.Stack;

public class Queue {
    // Define the data members(if any) here.
    Stack<Integer> st;
    Queue() {
        // Initialize your data structure here.
        st = new Stack<>();
    }

    void enQueue(int val) {
        // Implement the enqueue() function.
        st.add(val);
    }

    int deQueue() {
        if(st.isEmpty()) return -1;
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.add(st.pop());
        }
        int ele = temp.pop();
        while (!temp.isEmpty()) {
            st.add(temp.pop());
        }
        return ele;
        // Implement the dequeue() function.
    }

    int peek() {
        if(st.isEmpty()) return -1;
        // Implement the peek() function here.
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.add(st.pop());
        }
        int ele = temp.peek();
        while (!temp.isEmpty()) {
            st.add(temp.pop());
        }
        return ele;
    }

    boolean isEmpty() {
        // Implement the isEmpty() function here.
        return st.isEmpty();
    }
}