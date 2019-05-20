package nowcoder.zhaoshangyinhangxinyongka.T2019_4_9;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if (n <6){
                System.out.println(0);
            }
            else {
                long mark = 1;
                for (int i = 0; i < n - 6; i++) {
                    mark *=  2;
                    mark %= 666666666;
                }
                System.out.println(mark);
            }

        }
    }
}
