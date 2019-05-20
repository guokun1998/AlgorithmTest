package acmcoder.biancheng360;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            double angel = 1.0*L/R;
            double x = R*Math.cos(angel);
            double y = R*Math.sin(angel);

            System.out.printf("%.3f %.3f\n",x,-y);
            System.out.printf("%.3f %.3f\n",x,y);

        }
    }
}
