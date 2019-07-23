package leetcode.T80;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-24-9:53
 */
public class Solution {
    @Test
    public void test1(){
        int[] nums = {0,0,1,1,1,1,2,3,3};
//        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));

    }
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index-2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
