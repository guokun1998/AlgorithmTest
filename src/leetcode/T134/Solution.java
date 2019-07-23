package leetcode.T134;

/**
 * @author guokun
 * @create 2019-07-18-15:12
 */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index=-1;
        int num=gas.length;
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] != -1) {
                int t = gas[i] - cost[i];
                if (t >= 0) {
                    index = i;
                    if (i == gas.length-1) {
                        for (int j = 0; j < gas.length; j++) {

                        }
                    }
                }
            }
        }
        return 0;
    }
}
