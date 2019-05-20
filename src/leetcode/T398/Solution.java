package leetcode.T398;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    HashMap<Integer, List<Integer>> map;

    public Solution(int[] nums) {
        map = new HashMap<>(nums.length/4*3);
        for (int i = 0; i < nums.length; i++) {
            int t = nums[i];
            if (map.get(t) == null){
                List<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(i);
                map.put(t,list);
            }
            else {
                map.get(t).add(i);
            }
        }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        int mark = list.get(0);
        if (mark == list.size()-1){
            list.set(0,1);
        }
        else {
            list.set(0,mark+1);
        }
        return list.get(mark);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3};
        Solution s = new Solution(nums);
        System.out.println(s.pick(3));
        System.out.println(s.pick(3));
        System.out.println(s.pick(3));
        System.out.println(s.pick(3));

    }
}
