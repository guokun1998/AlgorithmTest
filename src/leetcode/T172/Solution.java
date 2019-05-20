package leetcode.T172;

import org.junit.Test;

public class Solution {
    @Test
    public void test1(){
        System.out.println(trailingZeroes(50));
    }
    public int trailingZeroes(int n) {
        if(n<5) {
            return 0;
        }
        else
        {
            return n/5+trailingZeroes(n/5);
        }
    }
}
