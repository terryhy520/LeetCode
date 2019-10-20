/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */

package com.terry.twosum;
import java.util.HashMap;
import java.util.Map;

/**
 * the sum of two numbers
 * @since 2019-09-18
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map leftNums = new HashMap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (leftNums.containsKey(nums[i])) {
                return new int[]{(int)leftNums.get(nums[i]),i};
            }
            leftNums.put(target - nums[i], i);
        }
        return null;
    }
}
