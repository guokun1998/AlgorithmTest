package leetcode.T107;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-27-9:58
 */
public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        solve(0,root);
        Collections.reverse(ans);
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
