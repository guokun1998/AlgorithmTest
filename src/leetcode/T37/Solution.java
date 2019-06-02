package leetcode.T37;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-29-8:18
 */
public class Solution {

    @Test
    public void test1(){
//        char[][] board = {{},{},{},{},{},{},{},{},{}}/
    }

    public void solveSudoku(char[][] board) {
        boolean isChanged = true;
        while (isChanged) {
            isChanged = false;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char c = board[i][j];
                    if (c == '.') {
                        int one = solveOne(board,i, j);
                        if (one == -1) {
                            continue;
                        }
                        else {
                            board[i][j] = (char)(one+'0');
                            isChanged = true;
                        }
                    }
                }
            }
        }
    }

    private int solveOne(char[][] board, int m,int n) {
        boolean[] isSelected = new boolean[10];
        for (int i = 0; i < 9; i++) {
            char c1 = board[m][i];
            char c2 = board[i][n];
            if (c1>='0' && c1 <= '9') {
                isSelected[c1-'0'] = true;
            }
            if (c2>='0' && c2 <= '9') {
                isSelected[c2-'0'] = true;
            }
        }
        int start1 = m-m%3;
        int start2 = n-n%3;
        for (int i = start1; i < start1+3; i++) {
            for (int j = start2; j < start2+3; j++) {
                char c2 = board[i][j];
                if (c2>='0' && c2 <= '9') {
                    isSelected[c2-'0'] = true;
                }
            }
        }
        int numOfOne = 0;
        for (int i = 1; i < 10; i++) {
            if (!isSelected[i]) {
                if (numOfOne == 0)
                    numOfOne = i;
                else {
                    numOfOne = 0;
                    break;
                }
            }
        }
        if (numOfOne == 0)
            return -1;
        else {
            return numOfOne;
        }
    }
}
