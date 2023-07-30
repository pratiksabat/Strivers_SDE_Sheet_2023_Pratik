import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    public static int[] findMedian(int[] arr, int n) {
        // Write your code here.
            // public static ArrayList<Integer> findMedian(ArrayList<Integer> arr) {
        ArrayList<Integer> medians = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            maxHeap.add(arr[i]);
            minHeap.add(maxHeap.peek());
            maxHeap.poll();

            if (maxHeap.size() < minHeap.size()) {
                maxHeap.add(minHeap.peek());
                minHeap.poll();
            }

            int median;
            if (maxHeap.size() > minHeap.size()) {
                median = maxHeap.peek();
            } else {
                median = (maxHeap.peek() + minHeap.peek()) / 2;
            }
            medians.add(median);
        }
        int[] res = new int[medians.size()];
        for(int i=0;i<medians.size();i++){
            res[i]=medians.get(i);
        }
        return res;
    // }
    }
}
