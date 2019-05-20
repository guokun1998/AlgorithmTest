package nowcoder.huawei.jinghuazhuanti;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class test8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            Map<Integer,Integer> hashMap = new TreeMap<Integer,Integer>();
            for (int i = 0; i < n; i++) {
                int k = scanner.nextInt();
                int v = scanner.nextInt();
                Integer temp = hashMap.get(k);
                if (temp == null){
                    hashMap.put(k,v);
                }
                else {
                    hashMap.put(k,v+temp);
                }
            }
            for (Map.Entry<Integer, Integer> t :
                    hashMap.entrySet()) {
                System.out.println(t.getKey()+" "+t.getValue());
            }
        }
    }
}
