package leetcode.T150;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] s = {"0","3","/"};
        solution.evalRPN(s);
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (s.equals("+")) {
                stack.push(stack.pop()+stack.pop());
            } else if (s.equals("*")) {
                stack.push(stack.pop()*stack.pop());
            } else if (s.equals("-")) {
                stack.push(-stack.pop()+stack.pop());
            } else if (s.equals("/")) {
                int m = stack.pop();
                int n = stack.pop();
                stack.push(n/m);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
