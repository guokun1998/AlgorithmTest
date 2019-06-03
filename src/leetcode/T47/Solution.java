package leetcode.T47;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author guokun
 * @create 2019-06-03-20:16
 */
public class Solution {

    @Test
    public void test1(){
        int[] arr = {1,1,2};
        List<List<Integer>> lists = permuteUnique(arr);
        System.out.println();
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permute = permute(nums);
        Set<List<Integer>> set = new HashSet<>(permute);
        permute.clear();
        permute.addAll(set);
        return permute;
    }
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0)
            return ans;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        a(list,new ArrayList<>());
        return ans;
    }

    private void a(List<Integer> source, List<Integer> list) {
        if (source.size() == 1) {
            list.add(source.get(0));
            ans.add(list);
            return;
        }
        for (int i = 0; i < source.size(); i++) {
            Integer t = source.get(i);
            List<Integer> temp = new ArrayList<>(list);
            temp.add(t);
            List<Integer> tempSource = new ArrayList<>(source.size());
            for (int j = 0; j < source.size(); j++) {
                if (j != i) {
                    tempSource.add(source.get(j));
                }
            }
            a(tempSource, temp);
        }
    }
}
