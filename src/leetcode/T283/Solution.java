package leetcode.T283;

/**
 * @author guokun
 * @create 2019-05-21-19:38
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i == p)
                    p++;
                else {
                    nums[p] = nums[i];
                    nums[i] = 0;
                    p++;
                }
            }
        }
    }
}
