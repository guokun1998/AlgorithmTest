package nowcoder.jianzhioffer;

public class test10_1 {
    public int RectCover(int target) {
        if (target == 0)
            return 0;
        if (target == 1)
            return 1;
        if (target == 2)
            return 2;
        int[] array = new int[target+1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i <= target; i++) {
            array[i] = array[i-1]+array[i-2];
        }
        return array[target];
    }
}
