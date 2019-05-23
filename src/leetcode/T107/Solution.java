package leetcode.T107;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-05-23-16:34
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            ans.add(null);
            return ans;
        }
        if (root.left == null && root.right == null) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            ans.add(list);
            return ans;
        }
        List<List<Integer>> left = levelOrderBottom(root.left);
        List<List<Integer>> right = levelOrderBottom(root.right);
        if (left == null)
            return right;
        if (right == null)
            return left;
        int ll = left.size() - right.size();
        if (ll < 0) {
            for (int i = 0; i < right.size(); i++) {
                if (i < -ll) {
                    ans.add(right.get(i));
                }
                else {
                    List<Integer> list = left.get(i+ll);
                    list.addAll(right.get(i));
                    ans.add(list);
                }
            }
        }
        else{
            for (int i = 0; i < left.size(); i++) {
                if (i < ll) {
                    ans.add(left.get(i));
                }
                else {
                    List<Integer> list = left.get(i);
                    list.addAll(right.get(i-ll));
                    ans.add(list);
                }
            }
        }
        List<Integer> last = new ArrayList<>();
        last.add(root.val);
        ans.add(last);
        return ans;
    }
}
