package nowcoder.mogujie2019.Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[][] ways = new int[x+1][y+1];
            for (int i = 0; i < ways.length; i++) {
                for (int j = 0; j < ways[i].length; j++) {
                    if (i == 0 || j == 0){
                        ways[i][j] = 1;
                    }
                    else {
                        ways[i][j] = ways[i-1][j]+ways[i][j-1];
                    }
                }
            }
            System.out.println(ways[x][y]);
        }
    }
}
