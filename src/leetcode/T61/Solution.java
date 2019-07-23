package leetcode.T61;

import leetcode.ListNode;
import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-19-10:24
 */
public class Solution {
    @Test
    public void test1(){
//        rotateRight()
    }


    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        int length=0;
        ListNode p = head;
        while (p != null) {
            length++;
            if (p.next == null) {
                break;
            }
            p = p.next;
        }
        k %= length;
        ListNode q = head;
        for (int i = 0; i < length-k-1; i++) {
            q = q.next;
        }
        p.next = head;
        ListNode t = q.next;
        q.next = null;
        return t;

    }
}
