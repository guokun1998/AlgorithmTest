package leetcode.T380;

import java.util.*;

public class Solution {

}
class RandomizedSet {

    private List<Integer> list;
    private Map<Integer,Integer> map;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new LinkedList<>();
        map = new HashMap<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.get(val) == null) {
            map.put(val,0);
            list.add(val);
            return true;
        } else {
            return false;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (map.get(val) != null) {
            map.remove(val);
        }
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return 0;
    }
}