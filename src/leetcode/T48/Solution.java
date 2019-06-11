package leetcode.T48;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-04-17:05
 */
public class Solution {

    @Test
    public void test1(){
        int[][] nums = {
                { 5, 1, 9,11},
                { 2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };
        rotate(nums);
        System.out.println();
    }


    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            solve(matrix, i, matrix.length-1-i);
        }
    }

    private void solve(int[][] matrix, int p, int q) {
        int distance=0;
        for (int i = p; i < q; i++) {
            int x1 = p;
            int y1 = p+i;
            int x2 = p+i;
            int y2 = q;
            int x3 = q;
            int y3 = q-i;
            int x4 = q-i;
            int y4 = p;
            swap4(matrix,x1,y1,x2,y2,x3,y3,x4,y4);
        }
    }

    private void swap4(int[][] matrix, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int t = matrix[x4][y4];
        matrix[x4][y4] = matrix[x3][y3];
        matrix[x3][y3] = matrix[x2][y2];
        matrix[x2][y2] = matrix[x1][y1];
        matrix[x1][y1] = t;
    }
}
class SolutionFormal {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i ++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
