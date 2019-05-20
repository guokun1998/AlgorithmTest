package leetcode.T915;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {5,0,3,8,6};
        System.out.println(solution.partitionDisjoint(a));
    }
    public int partitionDisjoint(int[] A) {

        int[] dp = new int[A.length];
        dp[A.length-1] = A[A.length-1];
        for (int i = A.length-2; i >= 1; i--) {
            if (A[i] < dp[i+1]) {
                dp[i] = A[i];
            } else {
                dp[i] = dp[i+1];
            }
        }
        int leftMax = A[0];
        int rightMin = dp[1];
        int p = 1;
        while (leftMax > rightMin) {
            p++;
            if (p == A.length) {
                break;
            }
            if (leftMax < A[p-1]) {
                leftMax = A[p-1];
            }
            rightMin = dp[p];
        }
        return p;
    }
}
