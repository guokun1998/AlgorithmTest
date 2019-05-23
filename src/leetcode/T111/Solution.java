package leetcode.T111;

import leetcode.TreeNode;

/**
 * @author guokun
 * @create 2019-05-23-18:45
 */
public class Solution {
    private int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        trance(root,0);
        return min;
    }

    private void trance(TreeNode node,int length) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                min = Math.min(length+1, min);
            }
            trance(node.left,length+1);
            trance(node.right,length+1);
        }

    }
}
