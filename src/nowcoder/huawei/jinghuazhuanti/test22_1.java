package nowcoder.huawei.jinghuazhuanti;

import java.util.*;

public class test22_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String in = scanner.next();
            HashMap<Character,Integer> map = new HashMap<>();
            for (int i = 0; i < in.length(); i++) {
                char c = in.charAt(i);
                if (map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }
                else {
                    map.put(c,1);
                }
            }
            Integer min = Collections.min(map.values());

            for (int i = 0; i < in.length(); i++) {
                char c = in.charAt(i);
                if (map.get(c) != min){
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
