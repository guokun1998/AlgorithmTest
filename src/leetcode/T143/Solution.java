package leetcode.T143;

import leetcode.ListNode;
import org.junit.Test;

/**
 * @author guokun
 * @create 2019-07-22-9:00
 */
public class Solution {

    @Test
    public void test1(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        reorderList(head);
        System.out.println();
    }

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        else if (head.next == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode index = null;
        boolean flag = false;
        while (true) {
            if (fast == null ||fast.next == null) {
                break;
            }
            else {
                fast = fast.next.next;
                if (fast == null) {
                    flag = true;
                    index = slow.next;
                    slow.next = null;
                    break;
                }
                else {
                    slow = slow.next;
                }
            }
        }
        ListNode node;
        if (index != null) {
            node = reverseList(index);
        }
        else {
            node = reverseList(slow);
        }
        ListNode p = head;
        ListNode q = node;
        while (p != null) {
            ListNode temp = p.next;
            p.next = q;
            q = q.next;
            p.next.next = temp;
            p = temp;
        }

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
}
