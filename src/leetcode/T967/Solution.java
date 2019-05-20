package leetcode.T967;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().numsSameConsecDiff(1, 0)));
    }
    public int[] numsSameConsecDiff(int N, int K) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] arr = {1};
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //MyTree myTree = new MyTree(list,-1);
        for (int i = 0; i < N; i++) {

        }
        int[] ans = new int[arrayList.size()];
        for (int i=0;i<ans.length;i++) {
            ans[i] = arrayList.get(i);
        }
        return ans;
    }


}
class MyTree{
    List<MyTree> list;
    int num;

    public MyTree(List<MyTree> list, int num) {
        this.list = list;
        this.num = num;
    }
}
