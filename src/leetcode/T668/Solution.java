package leetcode.T668;

public class Solution {
    public static void main(String[] args) {
        int[][] array = new int[5][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((i+1)*(j+1)+" ");
            }
            System.out.println();
        }
    }
}
