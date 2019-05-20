package cxydmmszn;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 程序员代码面试指南P21
 * 最大窗口数组
 * in： arr = {4，3，5，3，3，6，7}，w = 3
 * out：
 */
public class MaxWindow {
    public int[] getMaxWindos(int[] arr,int w){
        if (arr == null || w < 1 || arr.length < w){
            return  null;
        }
        LinkedList<Integer> qmax = new LinkedList<>();
        int[] res = new int[arr.length - w + 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst() == i-w){
                qmax.pollFirst();
            }
            if (i >= w-1){
                res[index++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,5,4,3,3,6,7};
        int w = 3;
        int[] maxWindos = new MaxWindow().getMaxWindos(arr, w);
        System.out.println(Arrays.toString(maxWindos));;
    }
}
