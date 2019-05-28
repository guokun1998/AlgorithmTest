package nowcoder.xiaozhao2018;

import java.util.Scanner;

/**
 * @author guokun
 * @create 2019-05-25-18:40
 */
public class BigIntegerMut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.next();
            String s2 = scanner.next();
//            System.out.println(Integer.valueOf(s1)*Integer.valueOf(s2));
            StringBuilder stringBuilder1 = new StringBuilder(s1);
            StringBuilder stringBuilder2 = new StringBuilder(s2);
            s1 = stringBuilder1.reverse().toString();
            s2 = stringBuilder2.reverse().toString();
            StringBuilder ans = new StringBuilder();
            int num2=0;
            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                int num1;//基数
                num2 = 0;//进数
                for (int j = 0; j < s2.length(); j++) {
                    num1 = c- '0';
                    char c1 = s2.charAt(j);
                    num1 *= (c1-'0');
                    num1 += num2;
                    num2 = num1/10;
                    int numNow = num1 % 10;
                    char c2;
                    if (j+i > ans.length()-1) {
                        c2 = '0';
                    }
                    else {
                        c2 = ans.charAt(j+i);
                    }
                    int temp = (c2 - '0') + numNow;
                    if (temp >= 10) {
                        num2++;
                        temp %= 10;
                    }
                    if (j+i > ans.length()-1) {
                        ans.append((char)(temp+'0'));
                    }
                    else {
                        ans.setCharAt(i+j,(char)(temp+'0'));
                    }
                }
                ans.append(num2);
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
            System.out.println(ans);
        }

    }

}
