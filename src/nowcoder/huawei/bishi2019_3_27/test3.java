package nowcoder.huawei.bishi2019_3_27;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();
            long[] xs = new long[N];
            long[] ys = new long[N];
            for (int i = 0; i < N; i++) {
                xs[i] = scanner.nextLong();
                ys[i] = scanner.nextLong();
            }
            System.out.println(N);
        }
    }
}
