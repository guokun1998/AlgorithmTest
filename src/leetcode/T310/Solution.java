package leetcode.T310;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[][] edges = {{0,3},{1,3},{2,3},{4,3},{5,4}};
        List<Integer> minHeightTrees = new Solution().findMinHeightTrees(6, edges);
        System.out.println(Arrays.toString(minHeightTrees.toArray()));
    }
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        boolean[][] relation = new boolean[n][n];
        boolean[] isThrow = new boolean[n];
        int[] numOfLink = new int[n];
        int mark = n;
        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            relation[x][y] = true;
            relation[y][x] = true;
            numOfLink[x]++;
            numOfLink[y]++;
        }

        while (mark>2){
            //找到叶子
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (!isThrow[i] && numOfLink[i] == 1){
                    arr.add(i);
                }
            }
            //删除叶子
            for (int k = 0; k < arr.size(); k++) {
                int i = arr.get(k);
                isThrow[i] = true;
                mark--;
                for (int j = 0; j < n; j++) {
                    if (relation[i][j]){
                        numOfLink[j]--;
                    }
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!isThrow[i]){
                list.add(i);
            }
        }
        return list;
    }
}
