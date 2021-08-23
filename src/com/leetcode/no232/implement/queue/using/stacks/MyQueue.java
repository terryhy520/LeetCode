package com.leetcode.no232.implement.queue.using.stacks;

import java.util.Stack;

public class MyQueue {
    Stack stackIn;
    Stack stackOut;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stackIn = new Stack<Integer>();
        stackOut = new Stack<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stackIn.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (stackOut.empty()) {
            while (!stackIn.empty()) {
                stackOut.push(stackIn.pop());
            }
        }
        return (int) stackOut.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        int value = pop();
        stackOut.push(value);
        return value;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stackIn.empty() && stackOut.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */