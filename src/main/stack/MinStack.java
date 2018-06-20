package main.stack;
/*

https://leetcode.com/problems/min-stack/description/

Thought process : Always start from the bottom and see how to arrival at the results

1:  In order for getMin() to be O(1).   We must keep a reference to the current min every step of way
2:

*/


import java.util.EmptyStackException;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            minStack.push(x);
            stack.push(x);
            return;
        }
        stack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        if (stack.isEmpty()) return;
        stack.pop();
        minStack.pop();
    }

    public int top() {
        if (stack.isEmpty()) throw new EmptyStackException();
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) throw new EmptyStackException();
        return minStack.peek();
    }
}
