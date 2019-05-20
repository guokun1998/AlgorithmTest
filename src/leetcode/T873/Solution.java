package leetcode.T873;

public class Solution {
    public int lenLongestFibSubseq(int[] A) {
        if (A.length <= 2)
            return 0;
        int[] dp = new int[A.length];//存长度
        int[] dp2 = new int[A.length];//存上一个的index
        dp[0] = 1;
        dp[1] = 2;
        dp2[1] = 0;
        for (int i = 3; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
//                if (dp[j] == 2)
            }
        }





        return 0;




    }
}
