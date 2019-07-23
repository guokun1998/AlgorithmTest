package leetcode.T94;

import leetcode.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author guokun
 * @create 2019-06-25-18:29
 */
public class Solution {


    @Test
    public void test1(){
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        List<Integer> list = inorderTraversal(treeNode);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        else {
            stack.push(root);
        }
        while (true) {
            if (stack.isEmpty()) {
                break;
            }
            TreeNode peek = stack.peek();

            if (peek.left != null) {
                stack.add(peek.left);
                peek.left = null;
            }
            else {
                TreeNode pop = stack.pop();
                ans.add(pop.val);
                if (pop.right != null) {
                    stack.push(pop.right);
                    pop.right = null;
                }
            }
        }
        return ans;
    }
}
