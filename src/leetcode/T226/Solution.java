package leetcode.T226;

import leetcode.TreeNode;
import org.junit.Test;

public class Solution {

    @Test
    public void test(){
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        invertTree(treeNode);
    }


    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;

        if (root.left != null)
            invertTree(root.left);
        if (root.right != null)
            invertTree(root.right);
        return root;
    }
}

