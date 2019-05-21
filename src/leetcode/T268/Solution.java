package leetcode.T268;

/**
 * @author guokun
 * @create 2019-05-21-18:43
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum =n*(n+1)/2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
