package leetcode.T832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null)
            return null;
        int[][] arr = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            int k=0;
            for (int j = A[i].length-1; j >= 0; j--) {
                if (A[i][j] == 1) {
                    arr[i][k] = 0;
                } else {
                    arr[i][k] = 1;
                }
                k++;
            }
        }
        return arr;
    }
}
