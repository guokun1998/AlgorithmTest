package leetcode.T42;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-02-10:33
 * 执行用时 : 3 ms, 在Trapping Rain Water的Java提交中击败了94.85% 的用户
 * 内存消耗 : 36.2 MB, 在Trapping Rain Water的Java提交中击败了91.81% 的用户
 */
public class Solution {

    @Test
    public void test1(){
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int[] arr = {4,9,4,5,3,2};
//        int[] arr = {4,2,3};
//        int[] arr = {5,4,1,2};
        System.out.println(trap(arr));
    }

    public int trap(int[] height) {
        if (height.length == 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum+=height[i];
        }
        int sum2 = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            if (height[left] == 0) {
                left++;
            }
            else if (height[right] == 0){
                right--;
            }
            else {
                break;
            }
        }
        while (left < right) {


            int leftNum = height[left];
            int rightNum = height[right];
            if (leftNum < rightNum) {
                for (int i = left; i < right; i++) {
                    if (height[i] <= leftNum) {
                        sum2+=leftNum;
                        left++;
                    }
                    else {
                        break;
                    }
                }
//                for (int i = right; i > left; i--) {
//                    if (height[i] <= rightNum) {
//                        sum2+=rightNum;
//                        right--;
//                    }
//                    else {
//                        break;
//                    }
//                }
            }
            else {
                for (int i = right; i > left; i--) {
                    if (height[i] <= rightNum) {
                        sum2+=rightNum;
                        right--;
                    }
                    else {
                        break;
                    }
                }
//                for (int i = left; i < right; i++) {
//                    if (height[i] <= leftNum) {
//                        sum2+=leftNum;
//                        left++;
//                    }
//                    else {
//                        break;
//                    }
//                }

            }

            if (left+1 == right) {
                return sum2-sum+height[left]+height[right];
            }
        }
        sum2+=height[left];
        return sum2-sum;
    }

}
