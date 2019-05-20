package nowcoder.jianzhioffer;

import java.util.ArrayList;
import java.util.List;

public class test4_1 {
    public static void main(String[] args) {
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};
        new test4_1().reConstructBinaryTree(pre,in);
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        boolean flag = true;
        if (pre.length==0){
            return null;
        }
        int root = pre[0];

        int left = 0;
        int right = 0;

        TreeNode ans = new TreeNode(root);
        for (int i = 0; i < in.length; i++) {
            int t = in[i];
            if (t == root)
                flag = false;
            if (flag){
                left++;
            }
            else {
                right++;
            }
        }
        TreeNode p = ans;
        int mark = 0;
        for (int i = 1; i < pre.length; i++) {
            if (i<=left){
                //判断顺序是否一致
                if (judgeIfOrderSame(p.val,pre[i],in)){
                    //如果一致，p.right = new TreeNode(mark)
                    p.right = new TreeNode(pre[i]);
                    //
                    p = p.right;
                }
                else {
                    p.left = new TreeNode(pre[i]);
                    p = p.left;
                }
                if (i == left){
                    p = ans;
                }
            }
            if (i>left){
                //判断顺序是否一致
                if (judgeIfOrderSame(p.val,pre[i],in)){
                    //如果一致，p.right = new TreeNode(mark)
                    p.right = new TreeNode(pre[i]);
                    //
                    p = p.right;
                }
                else {
                    p.left = new TreeNode(pre[i]);
                    p = p.left;
                }
            }

        }
        return ans;
    }
    public static boolean judgeIfOrderSame(int i,int j,int[] in){
        for (int k = 0; k < in.length; k++) {
            if (in[k] == i){
                return true;
            }
            else if (in[k] == j){
                return false;
            }
        }
        return false;
    }
}
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}