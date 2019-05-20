package leetcode.T914;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,4,3,2,1};
        System.out.println(new Solution().hasGroupsSizeX(arrays));
    }

    public boolean hasGroupsSizeX(int[] deck) {
        int X = 1;
        Map<Integer,Integer> map = new HashMap<>();
        int max = -1;
        for (int t :
                deck) {
            Integer temp = map.get(t);
            if (temp == null) {
                map.put(t,1);
            } else {
                if (temp+1 > max) {
                    max = temp+1;
                }
                map.put(t,temp+1);
            }
        }
        Collection<Integer> values = map.values();
        int y = 2;
        boolean flag = true;
        for (int i = 2; i <= max; i++) {
            flag = true;
            for (int t :
                    values) {
                if (t % y != 0) {
                    y++;
                    flag = false;
                    continue;
                }
            }
            if (flag) {
                return true;
            }
        }

        return false;

    }
}
