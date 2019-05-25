package leetcode.T12;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-24-18:26
 */
public class Solution {

    @Test
    public void test1(){
        System.out.println(intToRoman(1994));
    }

    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        int temp;

        if (num >= 1000) {
            temp = num / 1000;
            for (int i = 0; i < temp; i++) {
                ans.append("M");
                num -= 1000;
            }
        }
        if (num >= 900) {
            ans.append("CM");
            num -= 900;
        }
        if (num >= 500) {
            ans.append("D");
            num -= 500;
        }
        if (num >= 400) {
            ans.append("CD");
            num -= 400;
        }
        if (num >= 100) {
            temp = num / 100;
            for (int i = 0; i < temp; i++) {
                ans.append("C");
                num -= 100;
            }
        }
        if (num >= 90) {
            ans.append("XC");
            num -= 90;
        }
        if (num >= 50) {
            ans.append("L");
            num -= 50;
        }
        if (num >= 40) {
            ans.append("XL");
            num -= 40;
        }
        if (num >= 10) {
            temp = num / 10;
            for (int i = 0; i < temp; i++) {
                ans.append("X");
                num -= 10;
            }
        }
        if (num >= 9) {
            ans.append("IX");
            num -= 9;
        }
        if (num >= 5) {
            ans.append("V");
            num -= 5;
        }
        if (num >= 4) {
            ans.append("IV");
            num -= 4;
        }
        if (num >= 1) {
            temp = num;
            for (int i = 0; i < temp; i++) {
                ans.append("I");
                num -= 1;
            }
        }
        return ans.toString();
    }
}
