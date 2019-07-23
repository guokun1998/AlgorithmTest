package leetcode.T75;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-19-15:58
 */
public class Solution {

    @Test
    public void test1(){
        int[] nums1 = {2,0,2,1,1,0};
        int[] nums2 = {1,2,0};
        int[] nums3 = {2,1,2};
        int[] nums4 = {0,2,2,2,0,2,1,1};
    }

    public void sortColors(int[] nums) {
        // 三指针
        int i=0, l=0, r=nums.length-1;
        while(i<=r){
            if(i<l || nums[i]==1)
                i++;
            else if(nums[i]==0)
                swap(nums,i,l++);
            else if(nums[i]==2)
                swap(nums,i,r--);
        }
    }

    private void swap(int[] nums, int i, int j){
        if(i==j)
            return;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
