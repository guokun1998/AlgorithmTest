package leetcode.T40;

import org.junit.Test;

import java.util.*;

/**
 * @author guokun
 * @create 2019-05-30-13:59
 */
public class Solution {

    @Test
    public void test1(){
//        int[] arr = {10,1,2,7,6,1,5};
        int[] arr = {2,5,2,1,2};
        combinationSum2(arr,5);
    }


    List<List<Integer>> ans1 = new ArrayList<>();
    Set<List<Integer>> ans = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dg(candidates,0,new ArrayList<>(),target,0);
        ans1.addAll(ans);
        System.out.println();
        return ans1;
    }

    private void dg(int[] candidates, int start, List<Integer> list, int target, int sum) {
        if (start >= candidates.length) {
            if (sum == target) {
                ans.add(list);
            }
            return;
        }
        if (sum > target) {
            return;
        }
        else if (sum == target) {
            ans.add(list);
            return;
        }
        else {
            for (int i = start; i < candidates.length; i++) {
                List<Integer> temp = new ArrayList<>(list);
                temp.add(candidates[i]);
                dg(candidates, i+1, temp, target, sum+candidates[i]);

            }
        }
    }
}
