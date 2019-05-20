package nowcoder.huawei.jinghuazhuanti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = scanner.next();
            }
            Arrays.sort(strings);
            for (int i = 0; i < n; i++) {
                System.out.println(strings[i]);
            }
        }
    }
}
