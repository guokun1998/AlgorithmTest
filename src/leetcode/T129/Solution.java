package leetcode.T129;

import leetcode.TreeNode;

/**
 * @author guokun
 * @create 2019-07-18-13:34
 */
public class Solution {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        trace(new StringBuilder(),root);
        return sum;
    }

    private void trace(StringBuilder stringBuilder,TreeNode node) {
        if (node != null) {
            stringBuilder.append(node.val);
            if (node.left == null && node.right == null) {
                sum += Integer.valueOf(stringBuilder.toString());
            }
            if (node.left != null) {
                trace(stringBuilder, node.left);
            }
            if (node.right != null) {
                trace(stringBuilder, node.right);
            }
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
