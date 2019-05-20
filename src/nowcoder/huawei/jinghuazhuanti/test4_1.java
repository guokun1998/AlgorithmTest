package nowcoder.huawei.jinghuazhuanti;

import java.util.Scanner;

public class test4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            if (s!=""){
                if (s.length() <= 8){
                    System.out.print(s);
                    for (int i = 0; i < 8 - s.length(); i++) {
                        System.out.print(0);
                    }
                    System.out.println();
                }
                else {
                    int times = s.length()/8;
                    for (int i = 0; i < times; i++) {
                        System.out.println(s.substring(8*i,8+8*i));
                    }
                    int last = s.length()%8;
                    if (last != 0){
                        System.out.print(s.substring(times*8));

                        for (int i = 0; i < 8 - last; i++) {
                            System.out.print(0);
                        }
                        System.out.println();
                    }
                }
            }
            else {
                System.out.println(s);
            }
        }
    }
}
