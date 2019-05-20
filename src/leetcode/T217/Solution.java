package leetcode.T217;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i],1);
            }
            else
                return true;
        }
        return false;
    }
    public boolean containsDuplicateA(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum ^= nums[i];
//            if (sum == 0)

        }
        return true;
    }
}
