package leetcode.T198;

public class Solution {
    public int rob(int[] nums) {
        return myRob(nums,nums.length);
    }
    private int myRob(int[] nums,int length) {
        if (length == 0)
            return 0;
        else if (length == 1) {
            return nums[0];
        }
        else if (length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        else if (length == 3) {
            return Math.max(nums[0]+nums[2],nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = myRob(nums,1);
        dp[1] = myRob(nums,2);
        dp[2] = myRob(nums,3);
        for (int i = 3; i < nums.length; i++) {
            dp[i] = Math.max(Math.max(dp[i-2],nums[i-3]) + nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}
