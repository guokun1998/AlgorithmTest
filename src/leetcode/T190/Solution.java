package leetcode.T190;

import org.junit.Test;

public class Solution {

    @Test
    public void test1(){
        System.out.println(reverseBits(43261596));
    }

    public int reverseBits(int n) {
        StringBuilder stringBuilder = new StringBuilder(Integer.toBinaryString(n));

        stringBuilder.reverse();
        int length = stringBuilder.length();
        for (int i = 0; i < 32-length; i++) {
            stringBuilder.append(0);
        }
        int index = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) != '0') {
                break;
            }
            index++;
        }
        stringBuilder.delete(0,index);
        int ans = Integer.parseInt(stringBuilder.toString(),2);
        return ans;
    }
}
