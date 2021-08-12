/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */

package com.leetcode.no1.two.sum;
import java.util.HashMap;
import java.util.Map;

/**
 * the sum of two numbers
 * @since 2019-09-18
 */
public class TwoSum {
    public int[] twoSum(int[] numbs, int target) {
        Map leftNumbs = new HashMap(numbs.length);
        for (int i = 0; i < numbs.length; i++) {
            if (leftNumbs.containsKey(numbs[i])) {
                return new int[]{(int)leftNumbs.get(numbs[i]),i};
            }
            leftNumbs.put(target - numbs[i], i);
        }
        return null;
    }
}
