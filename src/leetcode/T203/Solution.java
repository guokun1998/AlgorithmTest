package leetcode.T203;

import leetcode.ListNode;
import org.junit.Test;

public class Solution {

    @Test
    public void test1(){
//        removeElements();
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;

        if (head.val == val) {
            return removeElements(head.next,val);
        }
        head.next = removeElements(head.next,val);
        return head;
    }

    private ListNode di(ListNode node, int val) {
        if (node == null)
            return null;

        if (node.next == null) {
            if (node.val == val) {
                return null;
            }
        }
        else {
            if (node.val == val) {
                node.next = node.next.next;
            }
        }
        removeElements(node.next,val);
        return node;
    }
}
