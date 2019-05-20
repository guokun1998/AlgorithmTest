package AlgorithmWirte;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] nums = {1,8,7,6,4,4,10};
//        bubbleSort(nums);
//        selectSort(nums);
        insertSort(nums);
        System.out.println(binarySearch(nums,3));
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 交换，
     * @param array 要交换的数组
     * @param x 要交换的坐标1
     * @param y 钥交换的坐标2
     */
    public static void swap(int[] array,int x,int y){
        int t = array[x];
        array[x] = array[y];
        array[y] = t;
    }

    /**
     * 冒泡排序：左右两个较大的放右边。
     * @param array
     */
    public static void bubbleSort(int[] array){
        for (int i = array.length-1; i >=0 ; i--) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }

    /**
     * 选择排序：每次选取最小的放入
     * @param array
     */
    public static void selectSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            int minNmber = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < minNmber){
                    minIndex = j;
                    minNmber = array[j];
                }
            }
            swap(array,i,minIndex);
        }
    }

    /**
     * 插入排序：和打扑克拿牌一样，拿到手后从后向前冒泡式的走到对应位置。
     * @param array
     */
    public static void insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (array[j]<array[j-1]){
                    swap(array,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    /**
     * 二分搜索
     * @param array 待查的数组
     * @param value 待查的值
     * @return 下标,-1代表没找到
     */
    public static int binarySearch(int[] array,int value){
        int left = 0;
        int right = array.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            if (array[mid] == value){
                return mid;
            }
            else if (array[mid]<value){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return -1;
    }
//    public static int binarySearchBtweenIndex(int[] array,int value){
//        int left = 0;
//        int right = array.length-1;
//        while (left <= right){
//            int mid = (left+right)/2;
////            if ()
//        }
//        return 0;
//    }
//    public static void binaryInsertSort(int[] array){
//        for (int i = 1; i < array.length; i++) {
//
//        }
//    }

}
