package cxydmmszn;
/**
 * 程序员代码面试指南P24
 * 构造数组中的maxTree
 * in： arr = {4，3，5，3，3，6，7}，w = 3
 * out：
 */
public class MaxTree {
    public Node getMaxTree(int[] arr){
        Node[] nArr = new Node[arr.length];
        for (int i = 0; i != arr.length ; i++) {
            nArr[i] = new Node(arr[i]);
        }
        return null;
    }
}
class Node{
    public int value;
    public Node left;
    public Node right;

    public Node(int data){
        this.value = data;
    }
}
