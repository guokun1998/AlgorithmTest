package leetcode.T202;

public class Solution {

    private int[] dp = {0,1,4,9,16,25,36,49,64,81};


    public boolean isHappy(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = c-'0';
            n += dp[num];
        }
        return true;
    }
}
