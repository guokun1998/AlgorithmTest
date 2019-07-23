package leetcode.T89;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-25-9:01
 */
public class Solution {

    @Test
    public void test1(){
        List<Integer> list = grayCode(4);
        list.forEach(System.out::println);
    }


    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        if (n == 0) {
            ans.add(0);
            return ans;
        }
        ans.add(0);
        ans.add(1);
        int js = 1;
        for (int i = 1; i < n; i++) {
            js<<=1;
            List<Integer> newList = new ArrayList<>(ans.size());
            for (int j = ans.size() - 1; j >= 0; j--) {
                newList.add(ans.get(j)+js);
            }
            ans.addAll(newList);
        }
        return ans;
    }
}
