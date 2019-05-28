package leetcode.T23;

import leetcode.ListNode;
import org.junit.Test;

import java.util.PriorityQueue;

/**
 * @author guokun
 * @create 2019-05-26-10:31
 * 维护一个优先队列，第一次将所有的头元素全放入，
 * 之后取优先队列第一个元素，放入结果中，再向优先队列中添加刚才取的元素的下一个，循环直到优先队列为空。
 */
public class Solution {

    @Test
    public void test1(){
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        head3.next = new ListNode(6);
        ListNode[] listNodes = {head1,head2,head3};
        ListNode listNode = mergeKLists(listNodes);
        System.out.println();
    }


    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode now = head;
        PriorityQueue<Point> priorityQueue = new PriorityQueue<>();
        //第一次全放入头节点的值
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                priorityQueue.add(new Point(lists[i].val,i));
                //指针后移
                lists[i] = lists[i].next;
            }

        }

        while (!priorityQueue.isEmpty()) {
            //取队头即最小值
            Point point = priorityQueue.poll();
            //放入结果中
            now.next = new ListNode(point.value);
            now = now.next;
            //添加刚才元素链表中的下一个
            if (lists[point.index] != null) {
                priorityQueue.add(new Point(lists[point.index].val,point.index));
                lists[point.index] = lists[point.index].next;
            }

        }
        return head.next;
    }
    private class Point implements Comparable<Point>{
        //值
        int value;
        //在原数组中的位置，方便以后添加它的下一个元素
        int index;
        Point(int value, int index){
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Point o) {
            return this.value-o.value;
        }
    }
}
