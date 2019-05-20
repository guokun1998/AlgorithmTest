package nowcoder.jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;

public class test2_1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        StringBuffer ans = new StringBuffer();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.set(4,5);
        System.out.println(Arrays.toString(a.toArray()));
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
            if (s.equals(" ")){
                ans.append("%20");
            }
            else {
                ans.append(s);
            }
        }
        System.out.println(ans);
    }
}
