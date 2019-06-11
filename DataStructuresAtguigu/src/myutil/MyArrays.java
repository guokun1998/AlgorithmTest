package myutil;

/**
 * @author guokun
 * @create 2019-06-11-20:32
 */
public class MyArrays {
    public static void twoDArraySout1(int[][] array) {
        for (int[] row : array) {
            for (int data : row) {
                System.out.print(data+"\t");
            }
            System.out.println();
        }
    }
}
