import java.util.* ;
import java.io.*; 
public class Queue {

    int[] queue;
    int rear;
    int front;
    Queue() {
        // Implement the Constructor
        queue = new int[5000];
        rear=0;
        front=0;
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        return rear==0;
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        queue[rear]=data;
        rear++;
    }

    int dequeue() {
        // Implement the dequeue() function
        if(front==rear) return -1;
        int ele = queue[front];
        queue[front]=0;

        for (int i = front+1; i < queue.length; i++) {
            queue[i-1]=queue[i];
        }
        rear--;
        return ele;
    }

    int front() {
        // Implement the front() function
        if(front==rear) return -1;
        return queue[front];
    }

}
