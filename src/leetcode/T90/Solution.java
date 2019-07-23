package leetcode.T90;

import org.junit.Test;

import java.util.*;

/**
 * @author guokun
 * @create 2019-07-22-14:23
 */
public class Solution {

    @Test
    public void test1(){
        int[] nums = {5,5,5,5,5};
        List<List<Integer>> lists = subsetsWithDup(nums);
        System.out.println();
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); //排序
        getAns(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void getAns(int[] nums, int start, ArrayList<Integer> temp, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            //和上个数字相等就跳过
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            getAns(nums, i + 1, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }

}
