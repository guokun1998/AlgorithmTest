package leetcode.T104;

import leetcode.TreeNode;
import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-23-16:23
 */
public class Solution {

    @Test
    public void test1(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
    }

    private int max = 0;
    public int maxDepth(TreeNode root) {
        trance(root,0);
        return max;
    }

    private void trance(TreeNode node,int length) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                max = Math.max(length+1,max);
            }
            trance(node.left,length+1);
            trance(node.right,length+1);
        }

    }

}
