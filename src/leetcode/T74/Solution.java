package leetcode.T74;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-19-14:26
 */
public class Solution {
    @Test
    public void test1(){
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(searchMatrix(arr, 0));
        System.out.println(searchMatrix(arr, 1));
        System.out.println(searchMatrix(arr, 7));
        System.out.println(searchMatrix(arr, 10));
        System.out.println(searchMatrix(arr, 12));
        System.out.println(searchMatrix(arr, 23));
        System.out.println(searchMatrix(arr, 30));
        System.out.println(searchMatrix(arr, 50));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        int left = 0;
        int right = matrix.length-1;
        if (matrix[left][0] > target) {
            return false;
        }
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (matrix[mid][0] == target) {
                return true;
            }
            else if (matrix[mid][0] > target) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
//        System.out.println(target+"---------"+left+"-----"+right);
//        System.out.println(right);
        return solve(matrix,right,target);
    }

    private boolean solve(int[][] matrix, int row, int target) {
        int left=0;
        int right = matrix[row].length-1;
        while (left <= right) {
            int mid = left+(right-left)/2;
            if (matrix[row][mid] == target) {
                return true;
            }
            else if (matrix[row][mid] > target) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return false;
    }
}
