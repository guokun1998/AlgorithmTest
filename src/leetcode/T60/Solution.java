package leetcode.T60;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-19-9:21
 */
public class Solution {

    @Test
    public void test1(){
        System.out.println(getPermutation(4, 4));
    }



    StringBuilder stringBuilder = new StringBuilder();
    public String getPermutation(int n, int k) {
        boolean[] isUsed = new boolean[n+1];
//        int[] jc = new int[n+1];
//        jc[1] = 1;
//        for (int i = 2; i < jc.length; i++) {
//            jc[i] = jc[i-1]*i;
//        }
        int sum=1;
        for (int i = 1; i <= n; i++) {
            sum*=i;
        }
        solve(k-1,sum,n,isUsed);

        return stringBuilder.toString();
    }

    private void solve(int k, int sum, int m, boolean[] isUsed) {
        if (stringBuilder.length() == isUsed.length-1)
            return;
        int base = sum/m;
        int t1 = k / base;
        int t2 = k % base;
        int t3=0;
        for (int i = 1; i < isUsed.length; i++) {
            if (!isUsed[i]) {
                if (t1==t3) {
                    stringBuilder.append(i);
                    isUsed[i] = true;
                    solve(t2,sum/m,m-1,isUsed);
                    return;
                }
                else {
                    t3++;
                }
            }
        }
    }
}
