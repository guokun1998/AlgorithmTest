package leetcode.T5;

/**
 * @author guokun
 * @create 2019-05-23-20:10
 */
public class Solution {
    int max = 1;
    int[][] maxAns = new int[1][2];
    public String longestPalindrome(String s) {
        if (s == null || s.equals(""))
            return null;

        for (int i = 0; i < s.length(); i++) {
            ks(s,i);
        }
        if (max == 1)
            return s.substring(0,1);
        return s.substring(maxAns[0][0], maxAns[0][1]+1);
    }
    private void ks(String s,int index) {
        int p = index-1;
        int q = index+1;
        int[][] ans = new int[1][2];
        ans[0][0] = index;
        ans[0][1] = index;
        while (p >= 0 && q<s.length()) {
            if (s.charAt(p) == s.charAt(q)) {
                ans[0][0] = p;
                ans[0][1] = q;
                p--;
                q++;
            }
            else {
                break;
            }
        }
        if (max < q-p) {
            max = q-p;
            maxAns = ans;
        }
    }
}
