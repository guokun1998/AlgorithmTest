package nowcoder.xiaozhao2018;

import java.util.Scanner;

public class test2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s1 = scanner.next();
            String s2 = scanner.next();
            StringBuilder stringBuilder1 = new StringBuilder(s1);
            StringBuilder stringBuilder2 = new StringBuilder(s2);
            stringBuilder1.reverse();
            stringBuilder2.reverse();
            StringBuilder stringBuilder3 = new StringBuilder();
            int num3=0;
            for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
                int num1=0;
                int num2=0;
                num3=0;
                if (i<s1.length()){
                    num1 = Integer.valueOf(stringBuilder1.substring(i,i+1));
                }
                if (i<s2.length()){
                    num2 = Integer.valueOf(stringBuilder2.substring(i,i+1));
                }
                num3 += num1*num2;
            }
        }
    }
}
