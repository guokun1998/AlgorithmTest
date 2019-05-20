package leetcode.T155;

import java.util.PriorityQueue;
import java.util.Stack;

public class Solution {

}

/**
 * 更好的思路：
 * 一个栈，push的同时push当前最小的元素
 * 2-3-1，则入栈后栈中元素序列为：2-2-3-2-1-1
 */
class MinStack{
    PriorityQueue<Integer> queue;
    Stack<Integer> stack;

    /** initialize your data structure here. */
    public MinStack() {
        queue = new PriorityQueue<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        queue.add(x);
    }

    public void pop() {
        Integer pop = stack.pop();
        queue.remove(pop);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return queue.peek();
    }
}