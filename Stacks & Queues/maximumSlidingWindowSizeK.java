import java.util.* ;
import java.io.*;

public class Solution
{

    public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) {
        //	  Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        int idx=0;
        Deque<Integer> dq = new ArrayDeque<>(nums.size()-k+1);

        for (int index = 0; index < nums.size(); index++) {
            if(!dq.isEmpty() && dq.peekFirst()==index-k){
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums.get(dq.peekLast())<=nums.get(index)) {
                dq.pollLast();
            }

            dq.offer(index);

            if(index>=k-1){
                res.add(nums.get(dq.peek()));
            }

        }
        return res;
    }

}