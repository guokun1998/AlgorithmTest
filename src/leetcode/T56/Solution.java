package leetcode.T56;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author guokun
 * @create 2019-06-18-18:58
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<Point> arrayList = new ArrayList<>(intervals.length);
        for (int[] row : intervals) {
            arrayList.add(new Point(row[0],row[1]));
        }
        Collections.sort(arrayList);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (Point point : arrayList) {
            if (list1.isEmpty()) {
                list1.add(point.x);
                list2.add(point.y);
            }
            else {
                Integer last = list2.get(list2.size() - 1);
                if (point.x <= last) {
                    if (last < point.y)
                        list2.set(list2.size()-1,point.y);
                }
                else {
                    list1.add(point.x);
                    list2.add(point.y);
                }
            }
        }
        int[][] res = new int[list1.size()][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0] = list1.get(i);
            res[i][1] = list2.get(i);
        }
        return res;
    }
    private class Point implements Comparable<Point>{
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            return x-o.x;
        }
    }
}
