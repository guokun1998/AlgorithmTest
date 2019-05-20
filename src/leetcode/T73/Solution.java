package leetcode.T73;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int[][] m = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        new Solution().setZeroes(m);
    }
    public void setZeroes(int[][] matrix) {
        Random random = new Random();
        int mark = random.nextInt();
        int mark2 = Integer.MAX_VALUE-1;
        boolean have = true;
        loop:
        while (have){

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == mark){
                        have = true;
                        mark = random.nextInt();
                        continue loop;
                    }
                }
            }
            have = false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    for (int k = 0; k < matrix[0].length; k++) {
                        if (matrix[i][k]!=0)
                            matrix[i][k] = mark;
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[k][j]!=0)
                            matrix[k][j] = mark;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == mark)
                    matrix[i][j] = 0;
            }

        }
    }
}
