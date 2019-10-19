/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */

package com.terry.sudoku.validparentheses;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    @Test
    public void isValid01() {
        String s = "(())";
        Solution solution = new Solution();
        assertTrue(solution.isValid(s));
    }

    @Test
    public void isValid02() {
        String s = "()()";
        Solution solution = new Solution();
        assertTrue(solution.isValid(s));
    }

    @Test
    public void isValid03() {
        String s = "())";
        Solution solution = new Solution();
        assertFalse(solution.isValid(s));
    }

    @Test
    public void isValid04() {
        String s = "())(";
        Solution solution = new Solution();
        assertFalse(solution.isValid(s));
    }
}