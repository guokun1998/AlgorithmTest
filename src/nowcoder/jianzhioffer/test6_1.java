package nowcoder.jianzhioffer;

import java.util.Arrays;

public class test6_1 {
    public int minNumberInRotateArray(int [] array) {
        int min = Integer.MAX_VALUE;
        for (int t :
                array) {
            if (t < min){
                min = t;
            }
        }
        return min;
    }
}
