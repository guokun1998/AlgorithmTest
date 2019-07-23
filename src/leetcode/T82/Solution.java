package leetcode.T82;

import leetcode.ListNode;
import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-24-13:42
 */
public class Solution {


    @Test
    public void test1(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        deleteDuplicates(head);
    }


    public ListNode deleteDuplicates(ListNode head) {

        ListNode ans = new ListNode(0);
        if (head == null) {
            return ans.next;
        }
        else if (head.next == null) {
            ans.next = new ListNode(head.val);
            return ans.next;
        }
        ListNode index = ans;
        ListNode last = null;
        ListNode now = head;
        ListNode next = head.next;
        while (now != null) {
            if (last == null && next == null) {
                index.next = new ListNode(now.val);
                index = index.next;
            }
            else if (last == null && next != null) {
                if (now.val != next.val) {
                    index.next = new ListNode(now.val);
                    index = index.next;
                }
            }
            else if (last != null && next == null) {
                if (now.val != last.val) {
                    index.next = new ListNode(now.val);
                    index = index.next;
                }
            }
            else if (last != null && next != null) {
                if (now.val != last.val && now.val != next.val) {
                    index.next = new ListNode(now.val);
                    index = index.next;
                }
            }
            last = now;
            now = next;
            if (now == null) {
                next = null;
            }
            else {
                next = now.next;
            }

        }
        return ans.next;
    }
}
