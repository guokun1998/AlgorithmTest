package leetcode.T237;

import leetcode.ListNode;

/**
 * @author guokun
 * @create 2019-05-20-19:47
 */
public class Solution {
    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        while (true) {
            node.val = node.next.val;
            if (node.next.next == null) {
                node.next = null;
                break;
            }
            node = node.next;
        }
    }
}
