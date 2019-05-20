package leetcode.T199;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        int length = rowIndex/2+1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (rowIndex == 0)
            return list;
        list.add(1);
        for (int i = 0; i < rowIndex - 1; i++) {
            List<Integer> nowList = new ArrayList<>(list.size()+1);
            nowList.add(1);
            for (int j = 1; j < list.size(); j++) {
                nowList.add(list.get(j)+list.get(j-1));
            }
            nowList.add(1);
            list = nowList;
        }
        return list;
    }

    public static void main(String[] args) {
        new Solution().getRow(9);
    }
}
