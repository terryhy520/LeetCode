/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */

package com.terry.romantointeger;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {
    @Test
    public void testRomanToInt01() {
        String s = "IV";
        RomanToInteger romanToInteger = new RomanToInteger();
        assertEquals(4, romanToInteger.romanToInt(s));
    }

    @Test
    public void testRomanToInt02() {
        String s = "LVIII";
        RomanToInteger romanToInteger = new RomanToInteger();
        assertEquals(58, romanToInteger.romanToInt(s));
    }

    @Test
    public void testRomanToInt03() {
        String s = "MCMXCIV";
        RomanToInteger romanToInteger = new RomanToInteger();
        assertEquals(1994, romanToInteger.romanToInt(s));
    }

    @Test
    public void testRomanToInt04() {
        String s = "MCMXLIV";
        RomanToInteger romanToInteger = new RomanToInteger();
        assertEquals(1944, romanToInteger.romanToInt(s));
    }
}