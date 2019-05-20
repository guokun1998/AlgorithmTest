package leetcode.T171;

public class Solution {
    public int titleToNumber(String s) {
        int loc = 0;
        int ans = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            char c = s.charAt(i);

            ans += (c-'A'+1)*(int)Math.pow(26,loc);
            loc++;
        }
        return ans;
    }
}
