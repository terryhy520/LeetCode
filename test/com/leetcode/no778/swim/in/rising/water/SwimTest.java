package com.leetcode.no778.swim.in.rising.water;

/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SwimTest {

    @Test
    public void swimInWater01() {
        int[][] grid = new int[][]{
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}};
        Swim swim = new Swim();
        int result = swim.swimInWater(grid);
        assertEquals(16, result);
    }

    @Test
    public void swimInWater02() {
        int[][] grid = new int[][]{
                {0, 2},
                {1, 3}};
        Swim swim = new Swim();
        int result = swim.swimInWater(grid);
        assertEquals(3, result);
    }
}