package leetcode.T812;

public class Solution {
    //S=(x1y2+x2y3+x3y1-x1y3-x2y1-x3y2) /2;
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        for (int i = 0; i < points.length-2; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            for (int j = i+1; j < points.length-1; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                for (int k = j+1; k < points.length; k++) {
                    int x3 = points[k][0];
                    int y3 = points[k][1];
                    double le = Math.abs((x1 * y2 + x2 * y3 + x3 * y1 - x1 * y3 - x2 * y1 - x3 * y2) / 2);
//                    double le = getArea(getDistance(x1,y1,x2,y2),getDistance(x3,y3,x2,y2),getDistance(x1,y1,x3,y3));
                    if (le > max){
                        max = le;
                    }
                }
            }

        }
        return max;

    }
    public static double getDistance(int x1,int y1,int x2,int y2){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    public static double getArea(double l1,double l2,double l3){
        double p = (l1+l2+l3)/2;
        return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
    }
}
