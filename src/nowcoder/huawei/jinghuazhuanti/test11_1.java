package nowcoder.huawei.jinghuazhuanti;

import java.util.Scanner;

public class test11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(new StringBuilder(scanner.next()).reverse());
        }
    }
}
