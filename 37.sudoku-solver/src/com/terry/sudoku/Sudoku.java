/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */

package com.terry.sudoku;

/**
 * 编写一个程序，通过已填充的空格来解决数独问题。
 *
 * 一个数独的解法需遵循如下规则：
 *
 *
 * 	数字 1-9 在每一行只能出现一次。
 * 	数字 1-9 在每一列只能出现一次。
 * 	数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 *
 * 空白格用 '.' 表示。
 *
 *
 *
 * 一个数独。
 *
 *
 *
 * 答案被标成红色。
 *
 * Note:
 *
 *
 * 	给定的数独序列只包含数字 1-9 和字符 '.' 。
 * 	你可以假设给定的数独只有唯一解。
 * 	给定数独永远是 9x9 形式的。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sudoku-solver
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since 2019/10/18
 * @author Terry Hwang
 */
public class Sudoku {
    public void solveSudoku(char[][] board) {
        // 三个布尔数组 表明 行, 列, 还有 3*3 的方格的数字是否被使用过
        boolean[][] rowUsed = new boolean[9][10];
        boolean[][] colUsed = new boolean[9][10];
        boolean[][][] boxUsed = new boolean[3][3][10];
        // 初始化
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                int num = board[row][col] - '0';
                if (1 <= num && num <= 9) {
                    rowUsed[row][num] = true;
                    colUsed[col][num] = true;
                    boxUsed[row / 3][col / 3][num] = true;
                }
            }
        }
        // 递归尝试填充数组
        recursiveSolveSudoku(board, rowUsed, colUsed, boxUsed, 0, 0);
    }

    private boolean recursiveSolveSudoku(char[][] board, boolean[][] rowUsed, boolean[][] colUsed,
                                         boolean[][][] boxUsed, int row, int col) {
        if (col == board[0].length) {
            col = 0;
            row++;
            if (row == board.length) {
                return true;
            }
        }

        if (board[row][col] == '.') {
            for (int num = 1; num <= 9; num++) {
                boolean canUse = !(rowUsed[row][num] || colUsed[col][num] || boxUsed[row/3][col/3][num]);
                if (canUse) {
                    rowUsed[row][num] = true;
                    colUsed[col][num] = true;
                    boxUsed[row/3][col/3][num] = true;
                    board[row][col] = (char)('0' + num);
                    if (recursiveSolveSudoku(board, rowUsed, colUsed, boxUsed, row, col+1)) {
                        return true;
                    }
                    rowUsed[row][num] = false;
                    colUsed[col][num] = false;
                    boxUsed[row/3][col/3][num] = false;
                    board[row][col] = '.';
                }
            }
        }
        else {
            return recursiveSolveSudoku(board, rowUsed, colUsed, boxUsed, row, col+1);
        }
        return false;
    }
}
