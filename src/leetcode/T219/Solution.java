package leetcode.T219;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i],i);
            }
            else {
                int t = map.get(nums[i]);
                if (i-t <= k) {
                    return true;
                }
                else {
                    map.put(nums[i],i);
                }
            }
        }
        return false;
    }
}
