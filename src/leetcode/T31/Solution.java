package leetcode.T31;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author guokun
 * @create 2019-05-26-14:44
 */
public class Solution {

    @Test
    public void test1(){
//        int[] nums = {2,3,1};
        int[] nums = {1,5,1};
        nextPermutation(nums);
        System.out.println();
    }



    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i-1]) {
                int num1Index = i-1;
                int num2Index = nums[i];
                int num3Index = 0;
                boolean isGet3 = false;

                for (int j = i; j < nums.length-1; j++) {
                    if (nums[j] > nums[i-1] && nums[j+1] <= nums[i-1]) {
                        isGet3 = true;
                        num3Index = j;
                    }
                }
                if (!isGet3) {
                    num3Index = nums.length-1;
                }
                swap(nums,i-1,num3Index);
                Arrays.sort(nums,i,nums.length);
                return;
            }
        }
        Arrays.sort(nums);
    }
    private void swap(int[] nums, int p, int q) {
        int t = nums[p];
        nums[p] = nums[q];
        nums[q] = t;
    }
}
