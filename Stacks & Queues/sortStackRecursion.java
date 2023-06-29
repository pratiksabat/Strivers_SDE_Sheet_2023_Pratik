import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		solve(stack);
	}

	public static void solve(Stack<Integer> stack){
		if (stack.isEmpty()) {
			return;
		}
		int ele = stack.pop();
		solve(stack);
		insertAtCorrectPos(stack,ele);
	}
	public static void insertAtCorrectPos(Stack<Integer> stack, int ele){
		if (stack.isEmpty() || stack.peek()<ele) {
			stack.add(ele);
			return;
		}
		int greaterEle = stack.pop();
		insertAtCorrectPos(stack, ele);
		stack.add(greaterEle);
	}
}