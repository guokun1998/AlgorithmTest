package leetcode.T103;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-28-18:29
 */
public class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        solve(0,root);
        for (int i = 0; i < ans.size(); i++) {
            if (i % 2 != 0) {
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }

    public void solve(int deep,TreeNode node) {
        if (node == null) {
            return;
        }
        if (deep < ans.size()) {
            List<Integer> list = ans.get(deep);
            list.add(node.val);
        }
        else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.val);
            ans.add(list);
        }
        if (node.left != null) {
            solve(deep+1,node.left);
        }
        if (node.right != null) {
            solve(deep+1, node.right);
        }
    }
}
