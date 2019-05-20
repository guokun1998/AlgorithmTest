package leetcode.T300;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0]=1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            int t = nums[i];
            for (int j = 0; j < i; j++) {
                if (nums[j]<t && dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
//                    break;
                }
            }
            if (dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
}
