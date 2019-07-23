package leetcode.T78;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-22-10:47
 */
public class Solution {

    @Test
    public void test1(){
        int[] nums = {1,2,4};
        subsets(nums);
        for (List<Integer> list : ans) {
            for (Integer integer : list) {
                System.out.print(integer+"--");
            }
            System.out.println();
        }
    }


        List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
//        ans.add(new ArrayList<>());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            dfs(new ArrayList<>(),0,nums.length,i,nums);
            list.add(nums[i]);
        }

        ans.add(list);
        return ans;
    }


    private void dfs(List<Integer> list, int start, int end, int k, int[] nums) {

        if (list.size() == k) {
            ans.add(list);
            return;
        }
        else {
            for (int i = start; i < end; i++) {
                List<Integer> now = new ArrayList<>(list);
                now.add(nums[i]);
                dfs(now,i+1,end,k, nums);
            }
        }

    }
}
