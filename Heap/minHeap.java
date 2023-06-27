import java.util.* ;
import java.io.*; 

public class Solution {

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        // Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(q[i][0]==0){
                pq.add(q[i][1]);
            }else{
                int r=q[i][0];
                while(r>0){
                    arr.add(pq.poll());
                    r--;
                }
            }
        }

        int[] res = new int[arr.size()];
        int i=0;
        for(Integer it:arr){
            res[i++]=it;
        }
        return res;
    }
}