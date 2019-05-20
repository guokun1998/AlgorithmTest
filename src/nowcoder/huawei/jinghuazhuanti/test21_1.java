package nowcoder.huawei.jinghuazhuanti;

import java.util.Scanner;

public class test21_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c>='A'&&c<='Y'){
                    stringBuilder.append((char)(c+1-'A'+'a'));
                }
                else if (c=='Z'){
                    stringBuilder.append("a");
                }
                else if (c>='0'&&c<='9'){
                    stringBuilder.append(c);
                }
                else if (c>='t'&&c<='v'){
                    stringBuilder.append(8);
                }
                else if (c>='w'&&c<='z'){
                    stringBuilder.append(9);
                }
                else if (c=='s'){
                    stringBuilder.append(7);
                }
                else {
                    stringBuilder.append((c-'a')/3+2);
                }
            }
            System.out.println(stringBuilder);
        }
    }
}
