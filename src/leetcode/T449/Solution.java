package leetcode.T449;

import jdk.internal.org.objectweb.asm.tree.LdcInsnNode;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        ArrayList<Integer> arrayList = new ArrayList<>();
//        new Solution().centerTrance(treeNode1, arrayList);
        Solution solution = new Solution();
        String serialize = solution.serialize(treeNode1);
        System.out.println(serialize);
        serialize = solution.serialize(solution.deserialize(serialize));
        System.out.println(serialize);
        Arrays.toString(arrayList.toArray());
    }



    public String serialize(TreeNode root) {
        List<TreeNode> deque = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        deque.add(root);
        int level = 1;
        while (!deque.isEmpty()) {
            TreeNode treeNode = deque.get(0);
            if (treeNode != null) {
                arrayList.add(treeNode.val);
                deque.add(treeNode.left);
                deque.add(treeNode.right);

            } else {
                arrayList.add(null);
            }
            deque.remove(treeNode);
        }
        return Arrays.toString(arrayList.toArray());
    }

    public TreeNode deserialize(String data) {
        String s = data.substring(1,data.length()-1);
        String[] split = s.split(", ");
//        System.out.println(split[7]);
        String first = split[1];
        TreeNode treeNode;
        if (first.equals("null")) {
            return null;
        } else {
            treeNode = new TreeNode(Integer.parseInt(first));
        }
        TreeNode root = treeNode;
        boolean isLeft = true;
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        int mark = 2;
        while (!linkedList.isEmpty()) {
            TreeNode treeNode1 = linkedList.get(0);
            String s1 = split[mark];
            if (s1.equals("null")) {
                treeNode1.left = null;
            } else {
                TreeNode treeNode2 = new TreeNode(Integer.parseInt(s1));
                treeNode1.left = treeNode2;
                linkedList.add(treeNode2);
            }
            mark++;
            s1 = split[mark];
            if (s1.equals("null")) {
                treeNode1.right = null;
            } else {
                TreeNode treeNode2 = new TreeNode(Integer.parseInt(s1));
                treeNode1.right = treeNode2;
                linkedList.add(treeNode2);
            }
            mark++;
            linkedList.remove(0);
        }

        return treeNode;
    }

    private List<Integer> centerTrance(TreeNode treeNode, List<Integer> list) {
        while (treeNode != null) {
            centerTrance(treeNode.left,list);
            list.add(treeNode.val);
            centerTrance(treeNode.right,list);
        }
        return list;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode(int x) { val = x; }
}