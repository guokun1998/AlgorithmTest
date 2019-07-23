package leetcode.T62;

/**
 * @author guokun
 * @create 2019-06-19-10:52
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        if (m <=0 || n<= 0)
            return 0;
        else if (m == 1 || n == 1)
            return 1;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0]=1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i]=1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
