package com.terry.validparentheses;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    @Test
    public void TestIsValid() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("{}"));
    }
}
