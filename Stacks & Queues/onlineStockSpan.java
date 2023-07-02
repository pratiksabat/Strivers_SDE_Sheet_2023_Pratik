
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        ArrayList<Integer> result = new ArrayList<>();

        // Create a stack to store elements that are not processed yet
        Stack<Integer> stack = new Stack<>();
        int n = price.size();
        // Iterate over the array from right to left
        stack.add(0);
        result.add(1);
        for (int index = 1; index < n; index++) {

            while (!stack.isEmpty() && price.get(stack.peek())<=price.get(index)) {
                stack.pop();
            }

            if(stack.isEmpty()) result.add(index+1);
            else result.add(index-stack.peek());

            stack.push(index);
        }

        return result;
    }
}