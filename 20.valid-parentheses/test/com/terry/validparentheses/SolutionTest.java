/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */

package com.terry.validparentheses;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void TestIsValid01() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("{}"));
    }

    @Test
    public void TestIsValid02() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("(("));
    }

    @Test
    public void TestIsValid03() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("}}"));
    }

    @Test
    public void TestIsValid04() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("{}{[]}"));
    }
}
