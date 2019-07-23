package leetcode.T105;

import leetcode.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-28-19:18
 */
public class Solution {

    @Test
    public void test1(){
        int[] p = {3,9,20,15,7};
        int[] i = {9,3,15,20,7};
        TreeNode treeNode = buildTree(p, i);
        System.out.println();
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode ans = new TreeNode(0);
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        for (int t : preorder) {
            pre.add(t);
        }
        for (int t : inorder) {
            in.add(t);
        }
        TreeNode solve = solve(pre, in);
        return solve;
    }

    private TreeNode solve(List<Integer> pre, List<Integer> in) {
        if (pre.size() == 0)
            return null;
        if (pre.size() == 1) {
            return new TreeNode(pre.get(0));
        }
        int first = pre.get(0);
        List<Integer> preNewLeft = new ArrayList<>();
        List<Integer> inNewLeft = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < in.size(); i++) {
            int t = in.get(i);
            if (t != first) {
                inNewLeft.add(t);
            }
            else {
                index = i;
                break;
            }
        }
        for (int i = 1; i <= index; i++) {
            preNewLeft.add(pre.get(i));
        }

//        now = new TreeNode(0);
        TreeNode left = solve(preNewLeft, inNewLeft);


        List<Integer> preNewRight = new ArrayList<>();
        List<Integer> inNewRight = new ArrayList<>();
        for (int i = preNewLeft.size()+1; i < pre.size(); i++) {
            preNewRight.add(pre.get(i));
            inNewRight.add(in.get(i));
        }
        TreeNode right = solve(preNewRight,inNewRight);
        TreeNode now = new TreeNode(first);
        now.left = left;
        now.right = right;
        return now;
    }
}
