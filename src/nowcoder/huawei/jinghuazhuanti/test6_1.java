package nowcoder.huawei.jinghuazhuanti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            long a = scanner.nextLong();
            int temp = 2;
            List<Integer> list = new ArrayList<>();
            while (a != 1){
                while (a%temp == 0){
                    a/=temp;
                    list.add(temp);
                }
                temp++;
            }
            for (int i = 0; i < list.size();i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}
