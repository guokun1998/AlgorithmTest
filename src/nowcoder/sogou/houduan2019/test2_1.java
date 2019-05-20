package nowcoder.sogou.houduan2019;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class test2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();
            ArrayList<Integer> suger = new ArrayList<>();
            int max = 0;
            int locationOfMax = 0;
            for (int i = 0; i < N; i++) {
                int t = scanner.nextInt();
                if (t > max){
                    max = t;
                    locationOfMax = i;
                }
                suger.add(t);
            }
            int ming = 0;
            int hong = 0;
            int result = 0;
            boolean isMing = false;
            ArrayList<Integer> huan = new ArrayList<>();
            for (int i = locationOfMax+1; i < N; i++) {
                huan.add(suger.get(i));
            }
            for (int i = 0; i < locationOfMax; i++) {
                huan.add(suger.get(i));
            }
            result += max;
            int first = 0;
            int last = huan.size()-1;

            while (first<=last){
                if (isMing){
                    if (huan.get(first) < huan.get(last)){
                        result += huan.get(last);
                        System.out.println("ming xuan" + huan.get(last));
                        last--;
                    }
                    else {
                        result += huan.get(first);
                        System.out.println("ming xuan" + huan.get(first));
                        first++;
                    }
                    isMing = false;
                }
                else {
                    if (huan.get(first) <= huan.get(last)){
                        result -= huan.get(last);
                        System.out.println("hong xuan" + huan.get(last));
                        last--;
                    }
                    else {
                        result -= huan.get(first);
                        System.out.println("hong xuan" + huan.get(first));
                        first++;
                    }
                    isMing = true;
                }
            }
            System.out.println(result);
        }
    }
}
