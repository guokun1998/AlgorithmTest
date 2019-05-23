package leetcode.T121;

/**
 * @author guokun
 * @create 2019-05-23-19:20
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1)
            return 0;
        int max=prices[prices.length-1];
        int num=0;
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] > max) {
                max = prices[i];
                continue;
            }
            num = num < max-prices[i] ? max - prices[i] : num;
        }
        return num;
    }
}
