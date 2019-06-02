package leetcode.T41;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-01-14:31
 * 执行用时 : 1 ms, 在First Missing Positive的Java提交中击败了99.55% 的用户
 * 内存消耗 : 33.5 MB, 在First Missing Positive的Java提交中击败了100.00% 的用户
 * 遍历一次数组把大于等于1的和小于数组大小的值放到原数组对应位置，然后再遍历一次数组查当前下标是否和值对应，
 * 如果不对应那这个下标就是答案，否则遍历完都没出现那么答案就是数组长度加1。
 */
public class Solution {

    @Test
    public void test1(){
//        int[] arr = {1,1};
        int[] arr = {2,1};
        System.out.println(firstMissingPositive(arr));
    }


    public int firstMissingPositive(int[] nums) {
        if (nums.length <= 0)
            return 1;
        if (nums.length == 1) {
            if (nums[0] == 1)
                return 2;
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            swapUntilRight(nums,i);
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        if (nums[0] == nums.length)
            return nums.length+1;
        return nums.length;
    }

    private void swapUntilRight(int[] nums, int p) {
        while (nums[p] != p) {
            int num = nums[p];
            if (num == nums.length) {
                nums[0] = nums.length;
                return;
            }
            if (num >= 0 && num < nums.length) {
                if (nums[p] == nums[num])
                    return;
                swap(nums,p,num);
            }
            else {
                return;
            }
        }
    }

    private void swap(int[] nums, int p, int q) {
        int t = nums[p];
        nums[p] = nums[q];
        nums[q] = t;
    }
}
