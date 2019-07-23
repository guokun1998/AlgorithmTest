package leetcode.T109;

import leetcode.ListNode;
import leetcode.TreeNode;

/**
 * @author guokun
 * @create 2019-07-23-16:42
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode last = null;
        while (true) {
            if (fast == null) {
                break;
            }
            else if (fast.next == null) {
                break;
            }
            last = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        int num = slow.val;
        last.next = null ;
        ListNode left = head;
        ListNode right = slow.next;
        TreeNode leftTree = sortedListToBST(left);
        TreeNode rightTree = sortedListToBST(right);
        TreeNode now = new TreeNode(num);
        now.left = leftTree;
        now.right = rightTree;
        return now;
    }
}
