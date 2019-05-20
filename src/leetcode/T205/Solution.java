package leetcode.T205;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

    @Test
    public void test1(){
        System.out.println(isIsomorphic("ab", "aa"));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>(26);
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.get(c1) == null) {
                Iterator<Character> iterator = map.values().iterator();
                while (iterator.hasNext()) {
                    if (iterator.next() == c2) {
                        return false;
                    }
                }
                map.put(c1,c2);
            }
            else {
                if (map.get(c1) != c2) {
                    return false;
                }
            }
        }
        return true;
    }
}
