package nowcoder.huawei.bishi2018.test;

import java.util.Arrays;

public class test2_2 {
    public static void main(String[] args) {
        int[] array = {};
        new test2_1().sort(array,array.length);
        System.out.println(Arrays.toString(array));
    }
    public void sort(int[] array, int len) {
        // 完成这个函数
        for (int i = len-1; i >= 0 ; i--) {
            if (array[i]!=i){
                swapWithZero(array,len,array[i]);
                swapWithZero(array,len,i);
            }
        }
    }
    public void swapWithZero(int[] array, int len, int n) {
//        Main.SwapWithZero(array, len, n);
        int t = array[n];
        array[n] = array[0];
        array[0] = t;
    }
}
