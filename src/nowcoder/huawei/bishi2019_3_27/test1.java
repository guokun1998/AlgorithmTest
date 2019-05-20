package nowcoder.huawei.bishi2019_3_27;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            String in = scanner.next();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                StringBuilder s = new StringBuilder(in.substring(9 * i, 9 + 9 * i));
                if (s.charAt(0)=='0'){
                    s.deleteCharAt(0);
                    s.reverse();
                    stringBuilder.append(s);
                }else {
                    s.deleteCharAt(0);
                    stringBuilder.append(s);
                }
            }
            for (int i = 0; i < n-1; i++) {
                System.out.print(stringBuilder.substring(8*i,8+8*i)+" ");
            }
            System.out.println(stringBuilder.substring((n-1)*8));
        }
    }
}
/*
2
0abcdefgh1abcdefgh
4
0abcdefgh1abcdefgh0abcdefgh1abcdefgh
 */
