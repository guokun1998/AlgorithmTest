package nowcoder.huawei.jinghuazhuanti;

import java.util.Scanner;

public class test13_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            for (int i = s1.length-1; i > 0 ; i--) {
                System.out.print(s1[i]+" ");
            }
            System.out.println(s1[0]);
        }
    }
}
