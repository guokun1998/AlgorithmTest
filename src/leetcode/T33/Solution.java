package leetcode.T33;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-27-15:48
 */
public class Solution {

    @Test
    public void test1() {
        int[] nums = {3,4,5,6,7,1,2};
//        int[] nums = {3,1,2};
        System.out.println(search(nums, 0));
        System.out.println(search(nums, 1));
        System.out.println(search(nums, 2));
        System.out.println(search(nums, 3));
        System.out.println(search(nums, 4));
        System.out.println(search(nums, 5));
        System.out.println(search(nums, 6));
        System.out.println(search(nums, 7));
        System.out.println(search(nums, 8));
    }

    public int search(int[] nums, int target) {

        return dg(nums,0,nums.length-1,target);
    }

    private int dg(int[] nums, int left, int right, int target) {
        if (right-left == 0) {
            if (nums[left] == target)
                return 0;
            else {
                return -1;
            }
        }
        if (right-left == 1) {
            if (nums[left] == target)
                return 0;
            else if (nums[left+1] == target) {
                return 1;
            }
            else {
                return -1;
            }
        }
        if (right < left)
            return -1;
        int mid = left+(right-left)/2;
        if (nums[mid] == target)
            return mid;
        if (right-left >= 3) {
            if (nums[mid-1] == target)
                return mid-1;
            if (nums[mid+1] == target)
                return mid+1;
        }
        if (nums[left] == target)
            return left;
        if (nums[right] == target)
            return right;

        if (nums[left] <= nums[mid-1] && target > nums[left] && target < nums[mid-1]) {
            return binarySearch(nums, left, mid-1, target);
        }
        else if (nums[left] >= nums[mid-1] && (target > nums[left] || target < nums[mid-1])){
            return dg(nums, left, mid-1, target);
        }
        else if (nums[mid+1] <= nums[right] && target > nums[mid+1] && target < nums[right]){
            return binarySearch(nums, mid+1, right, target);
        }
        else if (nums[mid+1] >= nums[right] && (target > nums[mid+1] || target < nums[right])){
            return dg(nums, mid+1, right, target);
        }
        return -1;
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        int binLeft = left;
        int binRight = right;
        while (binLeft <= binRight) {
            int binMid = binLeft + (binRight - binLeft)/2;
            if (nums[binMid] == target) {
                return binMid;
            }
            else if (nums[binMid] < target) {
                binLeft = binMid+1;
            }
            else {
                binRight = binMid-1;
            }
        }
        return -1;
    }

    private Integer quick(int[] nums,int target,int left) {
        if (nums.length == 1) {
            if (nums[left] == target)
                return 0;
            else {
                return -1;
            }
        }
        if (nums.length == 2) {
            if (nums[left] == target)
                return 0;
            else if (nums[left+1] == target) {
                return 1;
            }
            else {
                return -1;
            }
        }
        if (nums.length == 3) {
            if (nums[left] == target)
                return 0;
            else if (nums[left+1] == target) {
                return 1;
            }
            else if (nums[left+2] == target) {
                return 2;
            }
            else {
                return -1;
            }
        }
        return null;
    }
}
