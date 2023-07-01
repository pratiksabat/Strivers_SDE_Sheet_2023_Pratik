import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Solution {
    public static int largestRectangle(ArrayList<Integer> heights) {
        // Write your code here.
        // Stack<Integer> st = new Stack<>();
        // int[] left = new int[heights.size()];
        // int[] right = new int[heights.size()];
        // for (int index = 0; index < heights.size(); index++) {
        //   while (!st.isEmpty() && heights.get(st.peek()) >= heights.get(index)) {
        //     st.pop();
        //   }
        //   if (st.isEmpty())
        //     left[index] = 0;
        //   else
        //     left[index] = st.peek() + 1;
        //   st.push(index);
        // }

        // // clear stack
        // while (!st.isEmpty()) {
        //   st.pop();
        // }

        // for (int index = heights.size() - 1; index >= 0; index--) {
        //   while (!st.isEmpty() && heights.get(st.peek()) >= heights.get(index)) {
        //     st.pop();
        //   }
        //   if (st.isEmpty())
        //     right[index] = heights.size() - 1;
        //   else
        //     right[index] = st.peek() - 1;
        //   st.push(index);
        // }

        // int max = 0;
        // for (int index = 0; index < heights.size(); index++) {
        //   max = Math.max(max, (right[index] - left[index] + 1) * heights.get(index));
        // }
        // return max;

        // OPTIMISED
        int n=heights.size();
        int max=0;
        Stack<Integer> st = new Stack<>();
        for (int index = 0; index <=n; index++) {
            while (!st.isEmpty() && (index==n || heights.get(st.peek()) >= heights.get(index))) {
                int height=heights.get(st.pop());
                int width=st.isEmpty()?index:index-st.peek()-1;
                max = Math.max(max, height*width);
            }
            st.push(index);
        }
        return max;
    }

}
