package nowcoder.jianzhioffer;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class test13_1 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null)
            return null;
        ListNode p = head;
        ListNode q = head;

        for (int i = 0; i < k-1; i++) {
            if (p.next == null)
                return null;
            p = p.next;
        }
        while (p.next != null){
            p = p.next;
            q = q.next;
        }
        return q;

    }
}
