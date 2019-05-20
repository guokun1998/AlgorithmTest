package leetcode.T29;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.divide(10, 3));
        System.out.println(solution.divide(7, -3));
        System.out.println(solution.divide(6, 3));
        System.out.println(solution.divide(-5, 3));
        System.out.println(solution.divide(-1, 3));
        System.out.println(solution.divide(0, 3));
    }
    public int divide(int dividend, int divisor) {

        boolean flag1 = true;
        boolean flag2 = true;
        if (dividend < 0){
            dividend = -dividend;
            flag1 = false;
        }
        if (divisor < 0){
            divisor = -divisor;
            flag2 = false;
        }


        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int ans = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            ans++;
        }
        if (flag1 && flag2 || !flag1 && !flag2)
            return ans;
        return -ans;
    }
}
