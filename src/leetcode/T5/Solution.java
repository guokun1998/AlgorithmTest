package leetcode.T5;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-23-20:10
 */
public class Solution {

    @Test
    public void test1(){
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
    }


    int max = 1;
    int[][] maxAns = new int[1][2];
    public String longestPalindrome(String s) {
        if (s == null)
            return null;
        if(s.equals(""))
            return "";

        for (int i = 0; i < s.length(); i++) {
            ks(s,i,i);
            if (i != s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
                ks(s,i,i+1);
            }
        }
        if (max == 1)
            return s.substring(0,1);
        return s.substring(maxAns[0][0], maxAns[0][1]+1);
    }
    private void ks(String s,int index1, int index2) {
        int p = index1-1;
        int q = index2+1;
        int[][] ans = new int[1][2];
        ans[0][0] = index1;
        ans[0][1] = index2;
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
        p++;
        q--;
        if (max < q-p+1) {
            max = q-p+1;
            maxAns = ans;
        }
    }
}
