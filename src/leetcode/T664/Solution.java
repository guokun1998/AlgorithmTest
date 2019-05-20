package leetcode.T664;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//give up
public class Solution {

    public int strangePrinter(String s) {
        HashMap<Character,Boolean> map2 = new HashMap<>();
        return 0;
    }
    private static int solve(String s, LinkedHashMap<Character,Boolean> map1) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxNumber = 1;
        char max = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == null) {
                map.put(c,1);
            } else {
                map.put(c,map.get(c)+1);
//                max = Math.max(map.get(c)+1,max);
                if ((map.get(c)+1) > maxNumber) {
                    maxNumber = (map.get(c)+1);
                    max = c;
                }
            }
        }
        for (Map.Entry<Character, Boolean> c :
                map1.entrySet()) {
            if (c.getKey() == max){
                c.setValue(true);
            }
        }
        return 0;



    }
}
