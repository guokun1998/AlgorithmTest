package leetcode.T36;

/**
 * @author guokun
 * @create 2019-05-28-20:04
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] check = new boolean[10];
        for (int i = 0; i < 9; i++) {
            check = new boolean[10];
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.')
                    continue;
                else if (check[c-'0']) {
                    return false;
                }
                else {
                    check[c-'0'] = true;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            check = new boolean[10];
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (c == '.')
                    continue;
                else if (check[c-'0']) {
                    return false;
                }
                else {
                    check[c-'0'] = true;
                }
            }
        }
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                check = new boolean[10];
                for (int k = i; k < i+3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        char c = board[k][l];
                        if (c == '.')
                            continue;
                        else if (check[c-'0']) {
                            return false;
                        }
                        else {
                            check[c-'0'] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
