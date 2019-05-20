package leetcode.T212;

import com.sun.org.apache.regexp.internal.RE;

import java.util.List;

public class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        int[][] w= {{0,1},{0,-1},{1,0},{-1,0}};
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            for (int j = 0; j < board.length; j++) {
                for (int k = 0; k < board[j].length; k++) {
                    int firstIndex = 0;
                }
            }
        }
        return null;
    }
}
