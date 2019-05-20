package leetcode.T167;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int t = numbers[i];
            int result = Arrays.binarySearch(numbers,target-t);
            if (result < 0 || result >= numbers.length)
                continue;
            if (numbers[result] == target-t){
                ans[0] = i+1;
                if (i == result) {
                    result++;
                }
                ans[1] = result+1;
                break;
            }
        }
        return ans;
    }
}
