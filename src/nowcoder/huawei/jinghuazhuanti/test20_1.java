package nowcoder.huawei.jinghuazhuanti;

import java.util.Scanner;

public class test20_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loop1:
        while (scanner.hasNext()){
            String s = scanner.next();
            if (s.length()<=8){
                System.out.println("NG");
                continue;
            }
            int fuzadu=0;
            boolean isa = false;
            boolean isA = false;
            boolean isnum = false;
            boolean iselse = false;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c>='a'&&c<='z'){
                    if (!isa){
                        fuzadu++;
                        isa =true;
                    }
                }
                else if (c>='A'&&c<='Z'){
                    if (!isA){
                        fuzadu++;
                        isA =true;
                    }
                }
                else if (c>='0'&&c<='9'){
                    if (!isnum){
                        fuzadu++;
                        isnum =true;
                    }
                }
                else {
                    if (!iselse){
                        fuzadu++;
                        iselse =true;
                    }
                }
            }
            if (fuzadu<3){
                System.out.println("NG");
                continue;
            }
            for (int i = 0; i < s.length()-2; i++) {
                String s1 = s.substring(i, i + 3);
                if (s.substring(0,i).contains(s1)||s.substring(i+3).contains(s1)){
                    System.out.println("NG");
                    continue loop1;
                }
            }
            System.out.println("OK");
        }
    }
}
