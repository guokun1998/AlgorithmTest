package nowcoder.jianzhioffer;

public class test8_1 {
    public int JumpFloor(int target) {
        int a = 1;
        int b = 2;
        if (target == 1){
            return a;
        }
        else if (target == 2)
            return b;
        int last1 = a;
        int last2 = b;
        int result = 0;
        for (int i = 3; i < target+1; i++) {
            result = last1+last2;
            last1 = last2;
            last2 = result;
        }
        return result;
    }
}
