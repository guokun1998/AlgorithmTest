package nowcoder.zhaoshangyinhangxinyongka.T2019_4_9;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            int times = 0;
//            for (int i = 0; i < n; i++) {
//                int t = array[i];
//                while (t != 1){
//                    t/=2;
//                    times++;
//                }
//            }
//            System.out.println(times);
            int minTimes = Integer.MAX_VALUE;
            loop1:
            for (int i = 0; i < n; i++) {
                int tempTimes = 0;
                int t = array[i];
                if (t % 2 == 1){
                    continue;
                }
                for (int j = 0; j < n; j++) {
                    int m = array[j];
                    while (m != t){
                        if (m > t){
                            m /= 2;
                            tempTimes++;
                            if (tempTimes > minTimes)
                                continue loop1;
                        }
                        else {
                            m *=2;
                            tempTimes++;
                            if (tempTimes > minTimes)
                                continue loop1;
                        }
                    }
                }
                if (tempTimes < minTimes){
                    minTimes = tempTimes;
                }
            }
            System.out.println(minTimes);
        }
    }
}
