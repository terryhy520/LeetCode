/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */

package com.terry.twosum;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum01() {
        int [] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int [] result = new int[]{0,1};
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(result, twoSum.twoSum(nums,target));
    }

    @Test
    public void twoSum02() {
        int [] nums = new int[]{3, 7, 11, 15};
        int target = 14;
        int [] result = new int[]{0,2};
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(result, twoSum.twoSum(nums,target));
    }

    @Test
    public void twoSum03() {
        int [] nums = new int[]{2, 7, 11, 15};
        int target = 26;
        int [] result = new int[]{2,3};
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(result, twoSum.twoSum(nums,target));
    }

    @Test
    public void twoSum04() {
        int [] nums = new int[]{1, 2, 7, 11, 15};
        int target = 9;
        int [] result = new int[]{1,2};
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(result, twoSum.twoSum(nums,target));
    }

    @Test
    public void twoSum05() {
        int [] nums = new int[]{1, 2, 7, 11, 15};
        int target = 16;
        int [] result = new int[]{0,4};
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(result, twoSum.twoSum(nums,target));
    }
}