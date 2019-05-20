package leetcode.T162;

public class Solution {

    /**
     * 为什么二分查找大的那一半一定会有峰值呢？（即nums[mid]<nums[mid+1]时，mid+1~N一定存在峰值）
     * 我的理解是，首先已知 nums[mid+1]>nums[mid]，那么mid+2只有两种可能，
     * 一个是大于mid+1，一个是小于mid+1，小于mid+1的情况，那么mid+1就是峰值，
     * 大于mid+1的情况，继续向右推，
     * 如果一直到数组的末尾都是大于的，那么可以肯定最后一个元素是峰值，因为nums[nums.length]=负无穷
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums.length==2) return nums[0]>nums[1]?0:1;
        int l=0,r=nums.length-1;
        int mid = l+(r-l)/2;
        while(l+2<=r){
            mid = l+(r-l)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]<nums[mid+1] && nums[mid]>nums[mid-1]){
                l = mid;
            }else{
                r = mid;
            }
        }
        return nums[l]>nums[r]?l:r;
    }
}
