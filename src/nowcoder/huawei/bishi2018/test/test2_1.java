package nowcoder.huawei.bishi2018.test;

import java.util.Arrays;

public class test2_1 {
    public static void main(String[] args) {
        int[] array = {};
        new test2_1().sort(array,array.length);
        System.out.println(Arrays.toString(array));
    }
    public void sort(int[] array, int len) {
        // 完成这个函数

        for (int i = 0; i < len; i++) {
            int max = array[0];
            int locationOfMax = 0;
            int lastIndex = len-1-i;
            for (int j = 0; j <= lastIndex; j++) {
                if (array[j]>max){
                    max = array[j];
                    locationOfMax = j;
                }
            }
            swapWithZero(array,len,locationOfMax);
            swapWithZero(array,len,lastIndex);
        }
//        System.out.println(Arrays.toString(array));
    }
    public void swapWithZero(int[] array, int len, int n) {
//        Main.SwapWithZero(array, len, n);
        int t = array[n];
        array[n] = array[0];
        array[0] = t;
    }
}
