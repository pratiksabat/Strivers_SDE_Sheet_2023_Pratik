import java.util.Stack;

public class Solution {
    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
        Stack<Character> st = new Stack<>();
        for (Character ch : expression.toCharArray()) {
            if(ch=='{' || ch=='(' || ch=='[') st.add(ch);
            else{
                 if(st.isEmpty()) return false;   
            if(st.peek()=='(' && ch==')') st.pop();
            else if(st.peek()=='[' && ch==']') st.pop();
            else if(st.peek()=='{' && ch=='}') st.pop();
            else st.add(ch);
            }
        }

        return st.isEmpty();
    }
}
// [()]{}{[()()]()}
// st=[(

// ch=
// {[}}(})