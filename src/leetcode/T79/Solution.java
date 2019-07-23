package leetcode.T79;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-22-11:09
 */
public class Solution {

    @Test
    public void test1(){
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','E','S'},
                {'A','D','E','E'},
                };
//        System.out.println(exist(board, "ABCCED"));
//        System.out.println(exist(board, "SEE"));
//        System.out.println(exist(board, "ABCB"));
        System.out.println(exist(board, "ABCESEEEFS"));

//        char[][] board = {{'a','a'}};
//        System.out.println(exist(board, "aaa"));
    }


    public boolean exist(char[][] board, String word) {
        if (word.equals("")) {
            return true;
        }
        if (board.length == 0)
            return false;
        char c = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == c) {
                    boolean[][] isGet = new boolean[board.length][board[0].length];
                    isGet[i][j] = true;
                    if (dfs(board,word.substring(1),isGet,i,j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, boolean[][] isGet, int m, int n) {
        boolean flag = false;
        if (word.equals("")) {
//            if ()
            return true;
        }
        char c = word.charAt(0);
        if (m>0 && !isGet[m-1][n] && board[m-1][n] == c) {
            isGet[m-1][n] = true;
            if (dfs(board, word.substring(1), isGet, m-1, n)) {
                flag = true;
            }
            else {
                isGet[m-1][n] = false;
            }
        }
        if (m<board.length-1 && !isGet[m+1][n] && board[m+1][n] == c) {
            isGet[m+1][n] = true;
            if (dfs(board, word.substring(1), isGet, m+1, n)) {
                flag = true;
            }
            else {
                isGet[m+1][n] = false;
            }
        }
        if (n>0 && !isGet[m][n-1] && board[m][n-1] == c) {
            isGet[m][n-1] = true;
            if (dfs(board, word.substring(1), isGet, m, n-1)) {
                flag = true;
            }
            else {
                isGet[m][n-1] = false;
            }
        }
        if (n<board[0].length-1 && !isGet[m][n+1] && board[m][n+1] == c) {
            isGet[m][n+1] = true;
            if (dfs(board, word.substring(1), isGet, m, n+1)) {
                flag = true;
            }
            else {
                isGet[m][n+1] = false;
            }
        }
        return flag;
    }
}
