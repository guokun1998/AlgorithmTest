package leetcode.T45;
class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        return jumpp(nums,0,nums.length-1);
    }
    public static int jumpp(int[] nums,int step,int index) {

        if (index == 0){
            return step;
        }
        int j=1;
        for (int i = index-1; i >= 0; i--) {

            if (nums[i] >= j){
                index = i;

            }
            j++;

        }
        return jumpp(nums,step+1,index);
//        return 0;
    }
}
