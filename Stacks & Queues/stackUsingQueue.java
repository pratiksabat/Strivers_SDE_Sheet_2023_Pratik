// import java.util.* ;
// import java.io.*; 
// public class Stack {

//     Queue<Integer> q1;
//     Queue<Integer> q2;
//     // int idx;
//     // Define the data members.

//     public Stack() {
//         // Implement the Constructor.
//         q1 = new LinkedList<Integer>();
//         q2 = new LinkedList<Integer>();
//         // idx=0;
//     }

//     /*----------------- Public Functions of Stack -----------------*/

//     public int getSize() { 
//         // Implement the getSize() function.
//         return q1.size();
//     }

//     public boolean isEmpty() {
//         // Implement the isEmpty() function.
//         return q1.isEmpty();
//     }

//     public void push(int element) {
//         // Implement the push(element) function.
//         if(q1.element())
//         q1.offer(element);
//         // idx++;
//     }

//     public int pop() {
//         if(isEmpty()) return -1;
//         // Implement the pop() function.
//         int n = q1.size()-1;
//         while (n>0) {
//             q2.offer(q1.poll());
//             n--;
//         }
//         int ele = q1.poll();
//         while (!q2.isEmpty()) {
//             q1.offer(q2.poll());
//         }
//         // idx--;
//         return ele;
//     }

// public int top() {
//     if (isEmpty()) return -1;
//     return q1.peek();
// }

// }
import java.util.*;
import java.util.Queue;
import java.io.*;

public class Stack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

   public Stack() { }// Implement the Constructor. }

    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() {
        return q1.size();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void push(int element) {
        while (!q1.isEmpty()) {
            q2.add(q1.element());
            q1.remove();
        }
        q1.add(element);
        while (!q2.isEmpty()) {
            q1.add(q2.element());
            q2.remove();
        }
    }

    public int pop() {
        int ans = 0;
        if (!q1.isEmpty()) {
            ans = q1.element();
            q1.remove();
        } else {
            return -1;
        }
        return ans;
    }

    public int top() {
        if (!q1.isEmpty()) {
            return q1.element();
        } else {
            return -1;
        }
    }
}