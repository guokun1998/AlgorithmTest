package leetcode.T59;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-18-19:45
 *
 */
public class Solution {


    @Test
    public void test1(){
        int[][] matrix = generateMatrix(5);
        for (int[] rwo : matrix) {
            for (int i : rwo) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        if (n == 0)
            return ans;
        solve(ans,0,n-1,1);
        return ans;
    }

    private void solve(int[][] ans,int p, int q, int start) {
        if (q-p==0) {
            ans[p][q]=start;
            return;
        }
        else if (q-p==1) {
            ans[p][p]=start;
            ans[p][p+1]=start+1;
            ans[p+1][p+1]=start+2;
            ans[p+1][p]=start+3;
            return;
        }
        else {
            for (int i = p; i <= q; i++) {
                ans[p][i]=start++;
            }
            for (int i = p+1; i < q; i++) {
                ans[i][q]=start++;
            }
            for (int i = q; i >= p; i--) {
                ans[q][i]=start++;
            }
            for (int i = q-1; i > p; i--) {
                ans[i][p]=start++;
            }
            solve(ans, p+1, q-1, start);
        }
    }
}
