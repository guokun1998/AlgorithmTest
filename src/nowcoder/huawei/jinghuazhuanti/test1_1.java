package nowcoder.huawei.jinghuazhuanti;

import java.util.Scanner;

public class test1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            int index = s.lastIndexOf(" ");
            if (index < 0){
                System.out.println(s.length());
            }
            else {
                System.out.println(s.length()-1-index);
            }
        }
    }
}
