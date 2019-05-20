package leetcode.T257;

import leetcode.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-05-20-20:29
 */




public class Solution {
    public ArrayList<String> result = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return result;
        dfs(root, "");
        return result;
    }

    public void dfs(TreeNode root, String tmp){
        int cur = root.val;

        tmp = (tmp.equals("")) ? String.valueOf(cur) : tmp + "->" + String.valueOf(cur);
        if(root.left != null)
            dfs(root.left, tmp);
        if(root.right != null)
            dfs(root.right, tmp);
        if(root.left == null && root.right == null){
            result.add(tmp);
            return;
        }
    }
    @Test
    public void test1(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        for (String binaryTreePath : binaryTreePaths(root)) {
            System.out.println(binaryTreePath);
        }

    }


}
