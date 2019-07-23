package leetcode.T86;

import leetcode.ListNode;

/**
 * @author guokun
 * @create 2019-06-25-8:41
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode big = new ListNode(0);
        ListNode indexSmall = small;
        ListNode indexBig = big;
        while (head != null) {
            if (head.val < x) {
                indexSmall.next = new ListNode(head.val);
                indexSmall = indexSmall.next;
            }
            else {
                indexBig.next = new ListNode(head.val);
                indexBig = indexBig.next;
            }
            head = head.next;
        }
        indexSmall.next = big.next;
        return small.next;
    }
}
