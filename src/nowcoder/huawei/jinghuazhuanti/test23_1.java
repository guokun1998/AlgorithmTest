package nowcoder.huawei.jinghuazhuanti;

import java.util.Scanner;

public class test23_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] ans = new int[n+1];
            ans[1] = 0;

        }
    }
    public static int getDeleteNumber(int[] arr,int m){
        if (arr[m-1] > arr[m]){
            return getDeleteNumber(arr,m-1)+1;
        }
        else {

        }
        return 0;
    }
}
