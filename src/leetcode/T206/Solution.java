package leetcode.T206;

import leetcode.ListNode;
import org.junit.Test;

public class Solution {
    @Test
    public void test1(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        reverseList(head);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        ListNode q = head.next;
        head.next = null;
        while (q != null) {
            ListNode temp = q.next;
            q.next = p;
            p = q;
            q = temp;
        }
        return p;

    }

    public ListNode reverseListByD(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        ListNode last = dG(head);
        temp.next = null;
        return last;

    }

    private ListNode dG(ListNode head) {
        ListNode p = head;
        ListNode q = head.next;
        ListNode r = head.next.next;
        q.next = p;
        if (r == null) {
            return p;
        }
        return dG(q);
    }


}
