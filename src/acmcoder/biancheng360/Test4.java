package acmcoder.biancheng360;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test4 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int main(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int t = array[i];
            if (map.get(t) == null) {
                map.put(t,1);
            }
            else {
                map.put(t,map.get(t)+1);
            }
        }
        Collection<Integer> values = map.values();
        int[] array1 = new int[values.size()];
        Iterator<Integer> iterator = values.iterator();
        int mark = 0;
        while (iterator.hasNext()) {
            array1[mark] = iterator.next();
            mark++;
        }
        int maxY = getMaxY(array1);
        if (maxY < 2)
            return 0;
        mark = 0;
        int sum = 0;
        iterator = values.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next()/maxY;
            mark++;
        }
        return sum;
    }
    static int getMaxY(int[] array){
        int max = 0;
        int maxY = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 2; i <= max; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if (array[j] % i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                maxY = i;
            }
        }
        return maxY;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            int res;

            res = main(array);
            System.out.println(String.valueOf(res));
        }

    }
}
