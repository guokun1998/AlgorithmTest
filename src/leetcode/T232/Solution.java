package leetcode.T232;

import java.util.Stack;

public class Solution {

}
class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;


    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int pop = 0;
        while (!stack1.isEmpty()) {
            pop = stack1.pop();
            if (stack1.isEmpty()) {
                break;
            }
            else {
                stack2.push(pop);
            }
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return pop;
    }

    /** Get the front element. */
    public int peek() {
        int pop = 0;
        while (!stack1.isEmpty()) {
            pop = stack1.pop();
            stack2.push(pop);
            if (stack1.isEmpty())
                break;
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return pop;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
    }
}
