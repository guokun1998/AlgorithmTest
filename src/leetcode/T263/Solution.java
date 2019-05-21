package leetcode.T263;

/**
 * @author guokun
 * @create 2019-05-21-18:30
 */
public class Solution {
    public boolean isUgly(int num) {
        while (num % 2 == 0 && num != 0) {
            num = (num>>1);
        }
        while (num % 3 == 0 && num != 0) {
            num /= 3;
        }
        while (num % 5 == 0 && num != 0) {
            num /= 5;
        }
        return num == 1;
    }
}
