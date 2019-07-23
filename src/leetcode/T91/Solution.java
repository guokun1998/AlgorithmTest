package leetcode.T91;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-25-9:38
 */
public class Solution {

    private int ans = 0;


    @Test
    public void test1(){
//        System.out.println(solve("12"));
//        System.out.println(solve("02"));
//        System.out.println(solve("20"));
//        System.out.println(solve("28"));
//        System.out.println(solve("43"));
        System.out.println(numDecodings("1787897759966261825913315262377298132516969578441036833255596967132573482281598412163216914566534565"));
//        System.out.println(5898240);
//        System.out.println(numDecodings("226"));
//        System.out.println(numDecodings("1226"));
//        System.out.println(numDecodings("726"));
//        System.out.println(numDecodings("226"));
    }
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        if (s.length() <= 2) {
            return solve(s);
        }
        dp[s.length()-1] = solve(s.substring(s.length()-1));
        dp[s.length()-2] = solve(s.substring(s.length()-2));
        for (int i = s.length()-3; i >= 0; i--) {
            String temp = s.substring(i, i+2);
            int t = solve(temp);
            if (t == 0) {
                dp[i] = 0;
            }
            else if (t == 1) {
                if (temp.charAt(1) == '0') {
                    dp[i] = dp[i+2];
                }
                else {
                    dp[i] = dp[i+1];
                }
            }
            else {
                dp[i] = dp[i+1]+dp[i+2];
            }
        }
        return dp[0];
    }


    public int solve(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) == '0') {
                return 0;
            }
            return 1;
        }
        else if (s.length() == 2) {
            char c1 = s.charAt(0);
            char c2 = s.charAt(1);
            if (c1 == '0') {
                return 0;
            }
            else if (c1 == '1') {
                if (c2 == '0') {
                    return 1;
                }
                else {
                    return 2;
                }
            }
            else if (c1 == '2') {
                if (c2 == '0' || c2 >= '7') {
                    return 1;
                }
                else {
                    return 2;
                }
            }
            else {
                if (c2 == '0') {
                    return 0;
                }
                else {
                    return 1;
                }
            }
        }
        return 0;
    }
}
