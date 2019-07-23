package leetcode.T63;

/**
 * @author guokun
 * @create 2019-06-19-11:00
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0)
            return 0;
        int n = obstacleGrid[0].length;
        if (m <=0 || n<= 0)
            return 0;
        else if (m == 1 || n == 1) {
            for (int[] row : obstacleGrid) {
                for (int t : row) {
                    if (t == 1)
                        return 0;
                }
            }
            return 1;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 0)
                dp[i][0]=1;
            else {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 0)
                dp[0][i]=1;
            else {
                break;
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (obstacleGrid[i][j] == 0)
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
