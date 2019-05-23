package leetcode.T118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-05-23-18:57
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) {
            ans.add(null);
            return ans;
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        ans.add(list1);

        if (numRows == 1) {
            return ans;
        }
        for (int i = 2; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            List<Integer> last = ans.get(i-2);
            list.add(1);
            for (int j = 0; j < i-2; j++) {
                list.add(last.get(j)+last.get(j+1));
            }
            list.add(1);
            ans.add(list);
        }
        return ans;
    }
}
