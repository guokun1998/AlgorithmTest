package leetcode.T235;

import leetcode.TreeNode;

import java.util.ArrayList;

public class Solution {

    ArrayList<Integer> arrayList = new ArrayList<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<Integer> arrayList = new ArrayList<>();




        return null;
    }

    private Object[] treeNodeToArrayNode(TreeNode root) {
        if (root != null)
            arrayList.add(root.val);
        treeNodeToArrayNode(root.left);


        return null;
    }
}
