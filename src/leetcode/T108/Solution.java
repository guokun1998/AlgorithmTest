package leetcode.T108;

import leetcode.TreeNode;

/**
 * @author guokun
 * @create 2019-07-22-10:24
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length - 1);
    }

    private TreeNode toBST(int[] nums, int left, int right) {
        if(left > right) return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(nums, left, mid - 1);
        root.right = toBST(nums, mid + 1, right);
        return root;
    }
}
