package nowcoder.huawei.jinghuazhuanti;

import java.util.Scanner;

public class test2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int count = 0;
            String s = scanner.next().toLowerCase();
            char target = scanner.next().charAt(0);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == target){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
