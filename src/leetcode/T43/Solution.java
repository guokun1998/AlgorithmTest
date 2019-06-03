package leetcode.T43;

/**
 * @author guokun
 * @create 2019-06-03-11:54
 */
public class Solution {

    public String multiply(String num1, String num2) {

            String s1 = num1;
            String s2 = num2;
//            System.out.println(Integer.valueOf(s1)*Integer.valueOf(s2));
            StringBuilder stringBuilder1 = new StringBuilder(s1);
            StringBuilder stringBuilder2 = new StringBuilder(s2);
            s1 = stringBuilder1.reverse().toString();
            s2 = stringBuilder2.reverse().toString();
            StringBuilder ans = new StringBuilder();
            int num3=0;
            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                int num4;//基数
                num3 = 0;//进数
                for (int j = 0; j < s2.length(); j++) {
                    num4 = c- '0';
                    char c1 = s2.charAt(j);
                    num4 *= (c1-'0');
                    num4 += num3;
                    num3 = num4/10;
                    int numNow = num4 % 10;
                    char c2;
                    if (j+i > ans.length()-1) {
                        c2 = '0';
                    }
                    else {
                        c2 = ans.charAt(j+i);
                    }
                    int temp = (c2 - '0') + numNow;
                    if (temp >= 10) {
                        num3++;
                        temp %= 10;
                    }
                    if (j+i > ans.length()-1) {
                        ans.append((char)(temp+'0'));
                    }
                    else {
                        ans.setCharAt(i+j,(char)(temp+'0'));
                    }
                }
                ans.append(num3);
            }
            ans.reverse();
            int index=-1;
            for (int i = 0; i < ans.length(); i++) {
                char c = ans.charAt(i);
                if (c == '0') {
                    index++;
                }
                else
                    break;
            }
            ans.delete(0,index+1);
            if (ans.length() == 0)
                return "0";
            return ans.toString();

    }
}
