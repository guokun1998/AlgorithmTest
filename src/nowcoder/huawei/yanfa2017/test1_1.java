package nowcoder.huawei.yanfa2017;

import java.util.Scanner;

public class test1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if (n == 0){
                break;
            }
            int result = 0;
            while (n > 2){
                int t = n/3;
                result = result + t;
                n = n%3 + t;
            }
            if (n == 2){
                result++;
            }
            System.out.println(result);
        }
    }
}
