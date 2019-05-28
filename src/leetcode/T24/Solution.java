package leetcode.T24;

import leetcode.ListNode;
import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-26-13:42
 */
public class Solution {

    @Test
    public void test1(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head = swapPairs(head);
        System.out.println();
    }


    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode p = head;
        ListNode pre = p;
        ListNode q = head.next;
        p.next = p.next.next;
        q.next = p;
        head = q;
        if (p.next == null || p.next.next == null)
            return head;
        while (p != null) {
            pre = p;
            p = p.next;
            q = p.next;
            p.next = p.next.next;
            q.next = p;
            pre.next = q;
            if (p.next == null || p.next.next == null)
                break;
        }
        return head;
    }
}
