package nowcoder.huawei.jinghuazhuanti;

import java.util.Scanner;

public class test3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int[] arr = new int[1001];
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int t = scanner.nextInt();
                arr[t] = t;
            }
            for (int i = 0; i < 1001; i++) {
                int t = arr[i];
                if (t != 0){
                    System.out.println(t);
                }
            }
        }
    }
}
