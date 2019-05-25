package leetcode.T11;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-24-16:43
 * 指向大的值的指针向内移动一定会减少，指向小的有可能增加，所以走小的。
 * 基本的表达式: area = min(height[i], height[j]) * (j - i)
 * 使用两个指针，值小的指针向内移动，这样就减小了搜索空间 因为面积取决于指针的距离与值小的值乘积，如果值大的值向内移动，距离一定减小，
 * 而求面积的另外一个乘数一定小于等于值小的值，因此面积一定减小，而我们要求最大的面积，因此值大的指针不动，而值小的指针向内移动遍历
 */
public class Solution {

    @Test
    public void test1(){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public int maxArea(int[] height) {
        int p=0;
        int q=height.length-1;
        int max = 0;
        while (p<q) {
            int numP = height[p];
            int numQ = height[q];
            int nowMax = Math.min(numP,numQ)*(q-p);
            max = max > nowMax ? max : nowMax;
            if (height[p] < height[q]) {
                p++;
            }
            else {
                q--;
            }
        }
        return max;
    }
}