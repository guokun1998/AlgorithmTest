package nowcoder.hrbeu.acm.D2019_4_3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            List<Integer> list = new LinkedList<>();
            int a = scanner.nextInt();
            int n = scanner.nextInt();
            int b = scanner.nextInt();
//            for (int j = 1; j < n+1; j++) {
//                System.out.println((int)Math.pow(a,j)%b);
//            }
            for (int j = 1; j < n; j++) {
//                int t = (int)Math.pow(a,j)%b;
                int t = 1;
                for (int k = 0; k < j; k++) {
                    t*=a;
                }
                t = t % b;
                if (list.isEmpty()){
                    list.add(t);
                }
                else {
                    if (list.get(0) == t){
                        break;
                    }
                    else {
                        list.add(t);
                    }
                }
            }
//            System.out.println(list.size());
            int temp = (n-1) % list.size();
            System.out.println(list.get(temp));
        }
    }
}
