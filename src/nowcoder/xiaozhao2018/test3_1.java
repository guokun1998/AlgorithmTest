package nowcoder.xiaozhao2018;

import java.util.Arrays;
import java.util.Scanner;

public class test3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = scanner.nextInt();
            }
            boolean[] isGet = new boolean[n];
            int m = scanner.nextInt();
            int[] w = new int[m];
            for (int i = 0; i < m; i++) {
                w[i] = scanner.nextInt();
            }
            Arrays.sort(h);
            Arrays.sort(w);
            int num = 0;
            for (int i = 0; i < m; i++) {
                int t = w[i];
                for (int j = 0; j < n; j++) {
                    if (!isGet[j] && t >= h[j]){
                        num++;
                        isGet[j] = true;
                        break;
                    }
                }
            }
            System.out.println(num);
        }
    }
}
