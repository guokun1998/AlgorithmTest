package leetcode.T64;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-19-11:15
 */
public class Solution {

    @Test
    public void test1(){
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        minPathSum(arr);
    }

    public int minPathSum(int[][] grid) {
        int[][] dp = grid.clone();
        if (grid.length<=0 || grid[0].length<=0)
            return 0;
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = dp[i][0]+dp[i-1][0];
        }
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = dp[0][i]+dp[0][i-1];
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                dp[i][j] = dp[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
