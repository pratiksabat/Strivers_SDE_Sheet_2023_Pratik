import java.util.* ;
import java.io.*; 
public class Kthlargest {

    PriorityQueue<Integer> queue = new PriorityQueue<>();
    int size;
    Kthlargest(int k, int[] arr) {
        // Write your code here.
        for(int i=0;i<arr.length;i++){
            queue.add(arr[i]);
            if(queue.size()>k) queue.poll();
        }
        size=k;
    }

    void add(int num) {
        queue.offer(num);
        int s1 = queue.size();
        while(queue.size()>size){
        queue.poll();
        }
    }

    int getKthLargest() {
        
        return queue.isEmpty()?-1:queue.peek();
    }
}
