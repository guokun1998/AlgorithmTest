package leetcode.T106;

import leetcode.TreeNode;
import org.junit.Test;

/**
 * @author guokun
 * @create 2019-07-23-15:10
 */
public class Solution {

    @Test
    public void test1(){
//        int[] i = {9,15,7,20,3};
//        int[] p = {9,3,15,20,7};
        int[] i = {1,2,3,4,5,6};
        int[] p = {5,4,6,3,2,1};
        TreeNode treeNode = buildTree(i, p);
        System.out.println();
    }

    int[] in;
    int[] post;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        in = inorder;
        post = postorder;
        TreeNode solve = solve(0, inorder.length-1,0, inorder.length-1);
        return solve;
    }

    private TreeNode solve(int fromInIndex,int endInIndex,int fromPostIndex,int endPostIndex) {
        int length = endInIndex - fromInIndex;
        if (length < 0 || endPostIndex < 0) {
            return null;
        }
        else if (length == 0) {
            return new TreeNode(in[fromInIndex]);
        }
        int num = post[endPostIndex];
        int index = 0;
        for (int i = fromInIndex; i <= endInIndex; i++) {
            if (in[i] == num) {
                index = i;
                break;
            }
        }
        TreeNode left = solve(fromInIndex, index-1, fromPostIndex, fromPostIndex+index-fromInIndex-1);
        TreeNode right = solve(index +1, endInIndex, fromPostIndex+index-fromInIndex, endPostIndex - 1);
        TreeNode now = new TreeNode(num);
        now.left = left;
        now.right = right;
        return now;

    }
}
