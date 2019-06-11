package leetcode.T54;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-07-13:32
 */
public class Solution {

    @Test
    public void test1(){
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
                };
        List<Integer> list = spiralOrder(arr);
        list.forEach(System.out::println);
    }


    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return null;
        List<Integer> ans = new ArrayList<>(matrix.length*matrix.length);
        spiralOrder(matrix,0,0,matrix.length-1,matrix[0].length-1,ans);
        return ans;
    }

    private void spiralOrder(int[][] matrix, int x1,int y1, int x2, int y2, List<Integer> ans) {
        for (int i = y1; i <= y2; i++) {
            ans.add(matrix[x1][i]);
        }
        if (x2-x1 == 0) {
            return;
        }
        else if (x2-x1 > 1) {
            for (int i = x1+1; i < x2; i++) {
                ans.add(matrix[i][y2]);
            }
        }
        for (int i = y2; i >= y1; i--) {
            ans.add(matrix[x2][i]);
        }
        if (y2-y1 == 0)
            return;
        if (x2-x1 > 1) {
            for (int i = x2-1; i > x1; i--) {
                ans.add(matrix[i][y1]);
            }
        }
        int newX1;
        int newY1;
        int newX2;
        int newY2;
        if (x2-x1 ==1) {
            return;
        }
        else {
            newX1 = x1+1;
            newY1 = y1+1;
        }
        if (y2-y1 <= 1)
            return;
        else {
            newX2 = x2-1;
            newY2 = y2-1;
        }
        spiralOrder(matrix, newX1, newY1, newX2, newY2, ans);
    }
}
