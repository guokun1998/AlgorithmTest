package acmcoder.biancheng360;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int[] dp = new int[n];
            dp[0] = 1;
            for (int i = 1; i < n; i++) {
                dp[i] = dp[i-1];
                int[] numOfColor = new int[10];
                for (int j = i-1; j >= 0 ; j--) {
                    if (a[j]!=a[i]){
                        numOfColor[a[j]]++;
                        if (numOfColor[a[j]]>1)
                            break;
                        if (j == 0){
                            dp[i] = (dp[i]+1)%1000000007;
                        }
                        else {
                            dp[i] = (dp[i]+dp[j-1])%1000000007;
                        }
                        dp[i] %= 1000000007;
                    }
                    else
                        break;
                }
            }
            System.out.println(dp[n-1]);
        }
    }
}
