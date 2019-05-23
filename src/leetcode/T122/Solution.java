package leetcode.T122;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-23-19:33
 */
public class Solution {

    @Test
    public void test1(){
        int[] arr = {7,1,5,3,6,4};
        maxProfit(arr);
    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 1)
            return 0;
        int sum=0;
        int high=prices[prices.length-1];
        int low=prices[prices.length-1];
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] < low) {
                low = prices[i];
            }
            else {
                sum += (high-low);
                high = prices[i];
                low = prices[i];
            }
        }
        sum += (high-low);
        return sum;
    }
}
