package leetcode.T98;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-27-9:18
 */
public class Solution {
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        center(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i-1)) {
                return false;
            }
        }
        return true;
    }

    public void center(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                center(root.left);
            }
            list.add(root.val);
            if (root.right != null) {
                center(root.right);
            }
        }
    }
}
