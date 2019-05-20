package acmcoder.biancheng360;
/**
 * http://exercise.acmcoder.com/quesexcuse?paperId=213
 * 分金子
 * 每次取两边的数。
 * 动态规划
 * dp[p][q]代表当前用户从p到q的选值的最优值
 * A要想到达最优值，则选完之后即 剩dp[p+1][q]或者dp[p][q-1] 只能留给B较小的那个最优值（博弈论）
 * 那么A的最优值就是p到q的和（总共的）减去其中更小的那个（更小的那个留给它选）
 * dp[p][q] = sum-Math.min(solve(p+1, q, array,dp),solve(p, q-1, array,dp));
 */


import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int T = scanner.nextInt();
            for (int i = 0; i < T; i++) {
                int n = scanner.nextInt();
                int sum = 0;//总数
                int[] array = new int[n];
                for (int j = 0; j < n; j++) {
                    array[j] = scanner.nextInt();
                    sum+=array[j];
                }
                int[][] dp = new int[n][n];
                int sc1 = solve(0,n-1,array,dp);
                System.out.println("Case #"+(i+1)+": "+ sc1 +" "+(sum-sc1));
            }
        }
    }

    private static int solve(int p,int q,int[] array,int[][] dp) {
        if (dp[p][q] != 0)
            return dp[p][q];
        if (p == q) {
            dp[p][p]=array[p];
            return array[p];
        }
        int sum = 0;
        for (int i = p; i <= q; i++) {
            sum+=array[i];
        }
        dp[p][q] = sum-Math.min(solve(p+1, q, array,dp),solve(p, q-1, array,dp));
        return dp[p][q];


    }
}
