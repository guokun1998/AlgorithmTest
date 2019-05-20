package leetcode.T880;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.decodeAtIndex("leet2code3", 10));
    }
    //考虑在扩容超出之前停止，监控超出的部分。
    public String decodeAtIndex(String S, int K) {
        String ans = null;
        int index=1;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c>='a' && c<='z') {
                index++;
                ans = c+"";
            } else {
                int times = Character.digit(c,10);
                if (index*(times-1) >= K) {

                }
                index *= (times-1);
            }
            if (index >= K) {
                return ans;
            }
        }
        return null;
    }
}
