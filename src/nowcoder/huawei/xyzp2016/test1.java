package nowcoder.huawei.xyzp2016;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] grade = new int[N+1];
        for (int i = 1; i <= N ; i++) {
            grade[i] = scanner.nextInt();
        }
        int[][] mark = new int[N+1][N+1];
        for (int i = 1; i < N+1; i++) {
            for (int j = i; j < N+1; j++) {
                if (j == i){
                    mark[i][j] = grade[i];
                }
                else {
                    int t = mark[i][j-1];
                    if (t < grade[j]){
                        mark[i][j] = grade[j];
                    }
                    else {
                        mark[i][j] = t;
                    }
                }
            }
        }
        for (int i = 0; i < M; i++) {
            String  c = scanner.next();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if (c.equals("Q")){
                System.out.println(mark[A][B]);

            }
            else {
                int t = grade[A];
                grade[A] = B;
            }
        }
    }
}
