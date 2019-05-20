package leetcode.T169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i],1);
            }
            else {
                int t = map.get(nums[i]);
                if (t +1 > nums.length/2) {
                    return nums[i];
                }
                else {
                    map.put(nums[i],t+1);
                }
            }
        }
        return 0;
    }
}
