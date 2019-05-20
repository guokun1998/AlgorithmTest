package nowcoder.jianzhioffer;

public class test14_1 {
    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode p,q,r;
        p = null;
        q = head;
        r = head.next;
        while (r != null){
            q.next = p;
            p = q;
            q = r;
            r = r.next;
        }
        q.next = p;
        return q;
    }
}
