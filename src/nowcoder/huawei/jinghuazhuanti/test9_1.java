package nowcoder.huawei.jinghuazhuanti;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class test9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            Set<String> set = new LinkedHashSet<>();
            for (int i = s.length()-1; i >= 0; i--) {
                String temp = s.substring(i,i+1);
                set.add(temp);
            }
            for (String temp :
                    set) {
                System.out.print(temp);
            }
            System.out.println();
        }
    }
}
