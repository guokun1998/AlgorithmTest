package nowcoder.huawei.yanfa2016;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class test1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if (n>1000)
                n= 1000;
            LinkedList<Integer> num = new LinkedList<>();
            int limit = 0;
            for (int i = 0; i < n; i++) {
                if (limit == 2){
                    limit = 0;
                    continue;
                }
                else {
                    num.add(i);
                }
                limit++;
            }
//        System.out.println(limit);
//        System.out.println(Arrays.toString(num.toArray()));

            while (num.size()>1){
                Iterator iterator = num.listIterator(0);
                while (iterator.hasNext()){
                    int t = (int)iterator.next();
                    if (limit == 2){
                        iterator.remove();
                        limit = 0;
                        continue;
                    }
                    limit++;
                }

            }

            System.out.println(num.get(0));

        }
    }
}