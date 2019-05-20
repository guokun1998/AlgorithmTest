package nowcoder.zhaoshangyinhangxinyongka.T2019_4_9;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int w = scanner.nextInt();
            int[] array = new int[2*n];
            for (int i = 0; i < 2 * n; i++) {
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            int minOfMen = array[n];
            int minOfWomen = array[0];

            if (1.0*minOfMen>=2.0*minOfWomen){
                if (3.0*minOfWomen*n >= w){
                    System.out.printf("%.6f\n",1.0*w);
                }
                else {
                    System.out.printf("%.6f\n",1.0*3*minOfWomen*n);
                }
            }
            else {
                if (1.5*minOfMen*n >= w){
                    System.out.printf("%.6f\n",1.0*w);
                }
                else {
                    System.out.printf("%.6f\n",1.5*minOfMen*n);
                }
            }

        }
    }
}
