package leetcode.T191;

import org.junit.Test;

public class Solution {
    public int hammingWeight(int n) {
        String string = Integer.toBinaryString(n);
        int num = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '1')
                num++;
        }
        return num;
    }


    @Test
    public void test1(){
        System.out.println(hammingWeight2(-Integer.MAX_VALUE + 2));
    }

    public int hammingWeight2(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1)
                count++;
        }
        return count;
    }
}
