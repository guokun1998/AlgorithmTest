package leetcode.T8;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-24-15:20
 */
public class Solution {

    @Test
    public void test1(){
        System.out.println(myAtoi("   +12"));
        System.out.println(myAtoi("   -12"));
        System.out.println(myAtoi(" 2  -12"));
        System.out.println(myAtoi(" ##2  -12"));
        System.out.println(myAtoi("-"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("3.114"));
        System.out.println(myAtoi("+-3"));
    }

    public int myAtoi(String str) {
        if (str == null || str.equals(""))
            return 0;
        Integer ans;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ')
                continue;
            else if (c == '+' || c == '-' || c >= '0' && c <= '9') {
                ans = opreation(str.substring(i));
                return ans;
            }
            else
                return 0;
        }
        return 0;
    }

    private Integer opreation(String str) {
        int num = 0;
        StringBuilder stringBuilder = new StringBuilder();

        if (str.charAt(0) == '+' || str.charAt(0)=='-') {
            stringBuilder.append(str.charAt(0));
            str = str.substring(1);
        }
        if (str.equals("") || !(str.charAt(0) >='0'&& str.charAt(0) <= '9'))
            return 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                stringBuilder.append(c);
            }
            else
                break;
        }
        try {
            num = Integer.valueOf(stringBuilder.toString());
        } catch (Exception e) {
            if (stringBuilder.charAt(0) == '-')
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
        return num;
    }
}
