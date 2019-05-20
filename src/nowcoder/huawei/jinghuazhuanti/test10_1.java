package nowcoder.huawei.jinghuazhuanti;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class test10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                String temp = s.substring(i,i+1);
                set.add(temp);
            }
            System.out.println(set.size());
        }
    }
}
