package leetcode.T141;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode fast = head.next;
        ListNode slow = head;
        while (slow != fast) {
            slow = slow.next;
            if (fast.next == null || fast.next.next == null)
                return false;
            fast = fast.next.next;
        }
        return true;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
}