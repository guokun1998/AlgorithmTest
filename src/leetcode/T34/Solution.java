package leetcode.T34;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-27-19:44
 */
public class Solution {

    @Test
    public void test1(){
        int[] nums = {0,0,0,0,1,2,3,3,4,5,6,6,7,8,8,8,9,9,10,10,11,11};
        int[] ints = searchRange(nums, 0);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
        ints = searchRange(nums, 11);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }


    /**
     * 执行用时 : 1 ms, 在Find First and Last Position of Element in Sorted Array的Java提交中击败了99.45% 的用户
     * 内存消耗 : 40.7 MB, 在Find First and Last Position of Element in Sorted Array的Java提交中击败了88.89% 的用户
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int binLeft = 0;
        int binRight = nums.length-1;
        while (binLeft <= binRight) {
            int binMid = binLeft + (binRight - binLeft)/2;
            if (nums[binMid] == target) {
                if (binMid-1 >= binLeft) {
                    if (nums[binMid-1] == target) {
                        ans[0] = index(nums,binLeft,binMid-1,target,true);
                    }
                    else {
                        ans[0] = binMid;
                    }
                }
                else {
                    ans[0] = binMid;
                }
                if (binMid+1 <= binRight) {
                    if (nums[binMid+1] == target) {
                        ans[1] = index(nums,binMid+1,binRight,target,false);
                        break;
                    }
                    else {
                        ans[1] = binMid;
                        break;
                    }
                }
                else {
                    ans[1] = binMid;
                    break;
                }
            }
            else if (nums[binMid] < target) {
                binLeft = binMid+1;
            }
            else {
                binRight = binMid-1;
            }
        }
        return ans;
    }

    private int index(int[] nums, int left, int right, int target, boolean isLeft) {
        int binLeft = left;
        int binRight = right;
        while (binLeft <= binRight) {
//            if (binLeft == binRight) {
//                if (nums[binLeft] == target)
//                    return binLeft;
//                return -1;
//            }
            int binMid = binLeft + (binRight - binLeft)/2;
            if (nums[binMid] == target) {
                if (isLeft) {
                    if (binMid-1 >= binLeft) {
                        if (nums[binMid-1] == target) {
                            return index(nums, binLeft, binMid-1, target, true);
                        }
                        else {
                            return binMid;
                        }
                    }
                    else {
                        return binMid;
                    }
                }
                else {
                    if (binMid+1 <= binRight) {
                        if (nums[binMid+1] == target) {
                            return index(nums, binMid+1, binRight, target, false);
                        }
                        else {
                            return binMid;
                        }
                    }
                    else {
                        return binMid;
                    }
                }
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

}
