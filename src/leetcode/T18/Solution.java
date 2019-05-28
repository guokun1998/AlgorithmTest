package leetcode.T18;

import org.junit.Test;

import java.util.*;

/**
 * @author guokun
 * @create 2019-05-25-13:22
 */
public class Solution {
    @Test
    public void test1(){
        int[] nums = {1, 0, -1, 0, -2, 2};
//        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> lists = fourSum(nums, 0);
        System.out.println();
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 4) {
            return ans;
        }
        Arrays.sort(nums);
        Set<List<Integer>> ans1 = new HashSet<>();
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i+1; j < nums.length-2; j++) {
                int left = j+1;
                int right = nums.length-1;
                int sum = target-nums[i]-nums[j];
                while (left < right) {
                    if (nums[left]+nums[right] < sum) {
                        left++;
                    }
                    else if (nums[left] + nums[right] > sum) {
                        right--;
                    }
                    else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans1.add(list);
                        left++;
                        right--;
                    }
                }
            }
        }
        ans.addAll(ans1);
        return ans;
    }
}
