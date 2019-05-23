package leetcode.T112;

import leetcode.TreeNode;

/**
 * @author guokun
 * @create 2019-05-23-18:52
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null) {
            return sum-root.val==0;
        }
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
