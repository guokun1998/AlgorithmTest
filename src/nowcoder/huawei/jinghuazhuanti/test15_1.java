package nowcoder.huawei.jinghuazhuanti;

import java.util.Scanner;

public class test15_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            String s = Integer.toBinaryString(scanner.nextInt());
            int num = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.substring(i,i+1).equals("1")){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
