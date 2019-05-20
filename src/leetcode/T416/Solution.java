package leetcode.T416;

class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        if (sum%2 != 0){
            return false;
        }
        sum /= 2;
        boolean[] dp = new boolean[sum+1];
        dp[0] = true;
        //该位置为true表示该位置可达，默认0可达
        //遍历nums数组，从sum值开始考察该值减去nums[i]是否可达，若可达，说明该值也可达。
        for(int i = 0; i < nums.length; i++){
            for(int j = sum; j >= nums[i]; j--){
                if (!dp[j]){
                    dp[j] = dp[j-nums[i]];

                    if(dp[sum]){
                        return true;
                    }
                }
//                dp[j] = dp[j] || dp[j-nums[i]];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        new Solution().canPartition(nums);
    }
}