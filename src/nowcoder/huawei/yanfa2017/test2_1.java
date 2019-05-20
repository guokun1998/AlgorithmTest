package nowcoder.huawei.yanfa2017;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class test2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            SortedSet<Integer> result = new TreeSet<>();
            result.clear();
            for (int i = 0; i < n; i++) {
                result.add(scanner.nextInt());
            }
            for (int t:result) {
                System.out.println(t);
            }
        }
    }
}
