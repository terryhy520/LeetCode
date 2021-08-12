/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */

package com.leetcode.no20.valid.parentheses;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since 2019/9/20
 */
public class Solution {
    public boolean isValid(String s) {
        // 不是2的整数倍一定是不匹配
        if (s.length() % 2 == 1) {
            return false;
        }
        int a = 0;
        char [] cache = new char[s.length()/2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                // 超过一半数目的左括号，说明右括号一定不够配对，返回失败
                if (a == s.length()/2) {
                    return false;
                }
                cache[a++] = s.charAt(i);
            }
            else if ((s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') && a == 0) {
                // 出现不存在左括号的配对的右括号，返回失败
                return false;
            }
            else if (s.charAt(i) == 1 + cache[a-1] || s.charAt(i) == 2 + cache[a-1]) {
                // ')'和'('之间只差1，']'、'}'和'['、'{'只差2
                a--;
            }
            else
                return false;
        }
        // a为0说明完全匹配，否则不匹配
        return a == 0;
    }
}
