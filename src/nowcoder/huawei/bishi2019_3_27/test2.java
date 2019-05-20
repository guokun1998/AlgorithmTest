package nowcoder.huawei.bishi2019_3_27;

import java.util.List;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            long[] xs = new long[5];
            long[] ys = new long[5];
            boolean[] isGet = new boolean[5];
            double sum = 0;
            for (int i = 0; i < 5; i++) {
                xs[i] = scanner.nextLong();
                ys[i] = scanner.nextLong();
            }
            double firstMin = getDistance(0,0,xs[0],ys[0]);
            int firstLocaiton = 0;
            for (int i = 1; i < 5; i++) {
                double distance = getDistance(0, 0, xs[i], ys[i]);
                if (distance < firstMin){
                    firstMin = distance;
                    firstLocaiton = i;
                }
            }
            sum+=firstMin;
            isGet[firstLocaiton] = true;
            long nowX = xs[firstLocaiton];
            long nowY = ys[firstLocaiton];
            for (int i = 0; i < 4; i++) {
                double min = -1;
                int minLocation=0;
                for (int j = 0; j < 5; j++) {
                    if (!isGet[j]){
                        double distance = getDistance(nowX, nowY, xs[j], ys[j]);
                        if (min==-1||distance <= min){
                            min = distance;
                            minLocation = j;

                        }
                    }
                }
                sum+=min;
                nowX = xs[minLocation];
                nowY = ys[minLocation];
                isGet[minLocation] = true;
            }
            System.out.println((long)(sum+getDistance(nowX,nowY,0,0)));
        }
    }
    public static double getDistance(long x1,long y1,long x2, long y2){
        return Math.sqrt(Math.abs(Math.pow(1.0*x1-x2,2)+Math.pow(1.0*y1-y2,2)));
    }
}
/*
200 0 200 10 200 50 200 30 200 25
0 -8 0 -7 0 -2 0 3 0 7
 */