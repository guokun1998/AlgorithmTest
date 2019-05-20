package leetcode.T225;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }
}
class MyStack {

    boolean isOne;
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        isOne = true;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int ans = queue2Queue(queue1,queue2,true);
        queue2Queue(queue2,queue1,false);
        return ans;
    }

    /** Get the top element. */
    public int top() {
        int ans = queue2Queue(queue1,queue2,false);
        queue2Queue(queue2,queue1,false);
        return ans;
    }
    private int queue2Queue(Queue<Integer> queue1,Queue<Integer> queue2,boolean isLeft) {
        int last = 0;
        while (!queue1.isEmpty()) {
            last = queue1.poll();
            if (queue1.isEmpty()) {
                if (isLeft) {
                    return last;
                }
                else {
                    queue2.add(last);
                    return last;
                }
            }
            else {
                queue2.add(last);
            }
        }
        return 0;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}