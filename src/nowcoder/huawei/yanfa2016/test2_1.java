package nowcoder.huawei.yanfa2016;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class test2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            Set<String> result = new LinkedHashSet<>();
            for (int i = 0; i < s.length(); i++) {
                result.add(s.substring(i,i+1));
            }
            for (String s1:result) {
                System.out.print(s1);
            }
            System.out.println();
        }
    }
}
