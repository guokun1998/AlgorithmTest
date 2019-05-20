package leetcode.T767;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String reorganizeString(String S) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (map.get(c)==null){
                map.put(c,1);
            }
            else {
                map.put(c,map.get(c)+1);
            }
        }
        for (Integer t :
                map.values()) {
            if (t>=S.length()+1/2){

            }
        }
        for (Map.Entry<Character,Integer> entry:
             map.entrySet()) {

        }
        return "";
    }
}
