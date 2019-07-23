package leetcode.T202;

import java.util.HashSet;

public class Solution {

    private int[] dp = {0,1,4,9,16,25,36,49,64,81};


    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while (true) {
            int solve = solve(n);
            if (solve == 1) {
                return true;
            }
            else {
                if (set.contains(solve)) {
                    return false;
                }
                else {
                    set.add(solve);
                    n = solve;
                }
            }
        }
    }

    private int solve(int n) {
        String s = String.valueOf(n);
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = c-'0';
            sum += dp[num];
        }
        return sum;
    }
}
