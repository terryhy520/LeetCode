package com.leetcode.no155.min.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {

    @Test
    public void minStack01() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }

    @Test
    public void minStack02() {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        assertEquals(0, minStack.getMin());
        minStack.pop();
        assertEquals(1, minStack.top());
        assertEquals(0, minStack.getMin());
    }
}