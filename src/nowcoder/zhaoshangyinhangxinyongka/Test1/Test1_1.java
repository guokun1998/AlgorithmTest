package nowcoder.zhaoshangyinhangxinyongka.Test1;

import java.util.Scanner;

public class Test1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println((n*n+n+2)/2);
        }
    }
}
