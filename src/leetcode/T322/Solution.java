package leetcode.T322;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for (int i = 1; i < amount+1; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            int minIndex = -1;
            int minTimes = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                int t = coins[j];
                if (i-t >= 0 && dp[i-t] != -1){
                    if (dp[i-t] < minTimes){
                        minIndex = i-t;
                        minTimes = dp[i-t];
                    }
                }
            }
            if (minIndex == -1){
                continue;
            }
            dp[i] = dp[minIndex]+1;
        }
        return dp[amount];
    }
}
