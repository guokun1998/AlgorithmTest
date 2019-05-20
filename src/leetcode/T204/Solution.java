package leetcode.T204;

public class Solution {
    /**
     * 开数组保留信息
     * 遇到任何质数（不需要额外判断，借助数组保留的信息），
     * 将所有的倍数的数字标记为非质数，同时，没标记的即是质数，
     * 从2开始到sqrt(n)标记即可，因为sqrt(n)后的都被标记了
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        boolean[] dp = new boolean[n];

        if (n <= 1)
            return 0;


        for (int i = 2; i*i < n; i++) {
            if (dp[i])
                continue;
            int limit = 2;
            int sum = limit*i;
            while (sum < n) {
                dp[sum] = true;
                limit++;
                sum = limit*i;
            }
        }

        int num = 0;
        for (int i = 2; i < n; i++) {
            if (!dp[i]) {
                num++;
            }
        }

        return num;
    }
}
