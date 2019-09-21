/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */

package com.terry.romantointeger;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since 2019/9/21
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int sum = 0;
        int length = s.length();
        char c;
        for (int i = 0; i < length; i++) {
            c = s.charAt(i);
            switch (c){
                case 'M':
                    sum += 1000;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'C':
                    if (i+1 < length && s.charAt(i+1) == 'D') {
                        sum += 400;
                        i++;
                    }
                    else if (i+1 < length && s.charAt(i+1) == 'M') {
                        sum += 900;
                        i++;
                    }
                    else {
                        sum += 100;
                    }
                    break;
                case 'X':
                    if (i+1 < length && s.charAt(i+1) == 'L') {
                        sum += 40;
                        i++;
                    }
                    else if (i+1 < length && s.charAt(i+1) == 'C') {
                        sum += 90;
                        i++;
                    }
                    else {
                        sum += 10;
                    }
                    break;
                case 'I':
                    if (i+1 < length && s.charAt(i+1) == 'V') {
                        sum += 4;
                        i++;
                    }
                    else if (i+1 < length && s.charAt(i+1) == 'X') {
                        sum += 9;
                        i++;
                    }
                    else {
                        sum += 1;
                    }
                    break;
                default:
                    break;
            }
        }
        return sum;
    }
}
