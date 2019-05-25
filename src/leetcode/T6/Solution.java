package leetcode.T6;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-24-10:33
 */
public class Solution {

    @Test
    public void test1(){
        //.equals("LCIRETOESIIGEDHN")

        System.out.println(convert("LEETCODEISHIRING", 3));
        System.out.println("LCIRETOESIIGEDHN");
        //.equals("LDREOEIIECIHNTSG")
        System.out.println(convert("LEETCODEISHIRING", 4));
        System.out.println("LDREOEIIECIHNTSG");
    }


    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        if (s.equals(""))
            return "";
        StringBuilder ans = new StringBuilder();
        StringBuilder raw = new StringBuilder(s);
        int numOfNull = (2*numRows-2)-(s.length()%(2*numRows-2));
        if (numOfNull != (2*numRows-2)) {
            for (int i = 0; i < numOfNull; i++) {
                raw.append("0");
            }
        }

        int times = (2*numRows-2);
        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows-1) {
                int num = i;
                while (num < raw.length()) {
                    if (raw.charAt(num) != '0') {
                        ans.append(raw.charAt(num));
                    }
                    num += times;
                }
            }
            else {
                int num1=i;
                int num2=times-i;
                while (num2 < raw.length()) {
                    if (raw.charAt(num1) != '0') {
                        ans.append(raw.charAt(num1));
                    }
                    if (raw.charAt(num2) != '0') {
                        ans.append(raw.charAt(num2));
                    }
                    num1 += times;
                    num2 += times;

                }
            }
        }
        return ans.toString();
    }
}
