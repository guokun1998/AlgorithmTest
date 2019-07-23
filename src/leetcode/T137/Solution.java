package leetcode.T137;

/**
 * @author guokun
 * @create 2019-07-18-16:06
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum |= num;
        }
        return sum;
    }
}
