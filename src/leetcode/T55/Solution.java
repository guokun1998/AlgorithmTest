package leetcode.T55;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-17-18:36
 */
public class Solution {


    @Test
    public void test1(){
        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }


    public boolean canJump(int[] nums) {
        boolean[] canGet= new boolean[nums.length];
        canGet[0] = true;
        int index=0;
        while (index<nums.length-1) {

            if (canGet[index]) {
                for (int i = 1; i <= nums[index]; i++) {
                    if (index+i<nums.length) {
                        canGet[index+i] = true;
                    }
                    if (index+i==nums.length-1)
                        return true;
                }
            }
            index++;
        }
        return canGet[nums.length-1];
    }
}
