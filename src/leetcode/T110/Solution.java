package leetcode.T110;

import leetcode.TreeNode;

/**
 * @author guokun
 * @create 2019-07-22-10:29
 */
public class Solution {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return trance(root);
    }

    private boolean trance(TreeNode node) {
        //如果是叶子结点，填值
        if (node.left == null && node.right == null) {
            node.val = 1;
        }
        else {
            //遍历左子树
            if (node.left != null) {
                boolean trance = trance(node.left);
                if (!trance) {
                    return false;
                }
            }
            //遍历右子树
            if (node.right != null) {
                boolean trance = trance(node.right);
                if (!trance) {
                    return false;
                }
            }
            //根据左右子树填值
            if (node.left != null && node.right != null) {
                int temp = node.left.val - node.right.val;
                if (Math.abs(temp) > 1) {
                    return false;
                }
                else {
                    node.val = temp>0? node.left.val+1:node.right.val+1;
                }
            }
            else if (node.left != null) {
                if (node.left.val > 1) {
                    return false;
                }
                else {
                    node.val = node.left.val+1;
                }
            }
            else if (node.right != null){
                if (node.right.val > 1) {
                    return false;
                }
                else {
                    node.val = node.right.val+1;
                }
            }
        }
        return true;
    }
}
