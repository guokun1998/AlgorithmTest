package leetcode.T258;

/**
 * @author guokun
 * @create 2019-05-21-18:23
 */
public class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        int temp = num%9;
        return  temp== 0 ? 9 : temp;
    }
}
