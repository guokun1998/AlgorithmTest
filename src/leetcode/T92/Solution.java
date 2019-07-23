package leetcode.T92;

import leetcode.ListNode;
import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-25-18:19
 */
public class Solution {

    @Test
    public void test1(){
        ListNode listNode = ListNode.example12345();
        reverseBetween(listNode,1,3);

    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n) {
            return head;
        }
        if (head.next.next == null) {

        }
        ListNode end1 = null;
        ListNode p = null;
        ListNode q = null;
        ListNode r = null;
        boolean flagP = false;
        int num = m==1?n:n-1;
        for (int i = 1; i <= num; i++) {
            if (i >= m) {
                if (!flagP) {
                    if (end1 == null) {
                        q = head;
                    }
                    else {
                        p = end1.next;
                        q = p.next;
                    }
                    r = q.next;
                    flagP = true;
                }
                else {
                    p = q;
                    q = r;
                    r = r.next;
                }
                q.next = p;
            }
            else {
                if (end1 == null) {
                    end1 = head;
                }
                else {
                    end1 = end1.next;
                }
            }
        }
        if (m == 1) {
            head.next = r;
            return q;
        }
        if (end1 != null) {
            end1.next.next = r;
            end1.next = q;
        }

        return head;
    }
}
