package nowcoder.huawei.xyzp2016;

import java.util.ArrayList;
import java.util.Scanner;

public class test1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] grade = new int[N+1];
        for (int i = 1; i <= N ; i++) {
            grade[i] = scanner.nextInt();
        }
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String  c = scanner.next();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if (c.equals("Q")){
                int result = 0;
                int min = Math.min(A,B);
                int max = Math.max(A,B);
                for (int j = min; j <= max ; j++) {
                    if (grade[j] > result){
                        result = grade[j];
                    }
                }
                results.add(result);
//                System.out.println(result);
            }
            else {
                grade[A] = B;
            }
        }
        for (int t:results) {
            System.out.println(t);
        }
    }
}
