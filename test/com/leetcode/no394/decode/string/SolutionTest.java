package com.leetcode.no394.decode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void decodeString() {
        Solution solution = new Solution();
        assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
        assertEquals("abccdcdcdxyz", solution.decodeString("abc3[cd]xyz"));
    }
}