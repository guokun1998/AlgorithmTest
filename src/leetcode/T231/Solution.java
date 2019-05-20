package leetcode.T231;

import org.junit.Test;

public class Solution {

    @Test
    public void test(){
        System.out.println(isPowerOfTwo(9));
    }

    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        while (n != 1) {
            if ((n&1) != 0) {
                return false;
            }
            n = (n>>1);
        }
        return true;
    }
}
