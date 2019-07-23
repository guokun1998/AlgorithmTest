package leetcode.T77;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-20-9:56
 */
public class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    @Test
    public void test1(){
        combine(4,2);
        for (List<Integer> list : ans) {
            for (Integer integer : list) {
                System.out.print(integer+"--");
            }
            System.out.println();
        }
    }


    public List<List<Integer>> combine(int n, int k) {
        dfs(new ArrayList<>(),1,n,k);
        return ans;
    }

    private void dfs(List<Integer> list, int start, int end, int k) {

        if (list.size() == k) {
            ans.add(list);
            return;
        }
        else {
            for (int i = start; i <= end; i++) {
                List<Integer> now = new ArrayList<>(list);
                now.add(i);
                dfs(now,i+1,end,k);
            }
        }

    }
}
