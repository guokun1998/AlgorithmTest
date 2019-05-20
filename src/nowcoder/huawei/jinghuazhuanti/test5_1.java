package nowcoder.huawei.jinghuazhuanti;

import java.util.Scanner;

public class test5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            int a = Integer.parseInt(s.substring(2),16);
            System.out.println(a);
        }
    }
}
