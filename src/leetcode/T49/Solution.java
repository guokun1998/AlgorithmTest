package leetcode.T49;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-07-8:51
 */
public class Solution {

    @Test
    public void test1(){
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strings);
        System.out.println();
    }


    private String getRuleString(String s) {
        int[] numOfLetter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            numOfLetter[c-'a']++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int t : numOfLetter) {
            stringBuilder.append(t);
        }
        return stringBuilder.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> rules = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            String rule = getRuleString(s);
            List<String> temp = rules.get(rule);
            if (temp == null) {
                List<String> list = new ArrayList<>();
                list.add(s);
                rules.put(rule,list);
            }
            else {
                temp.add(s);
            }
        }
        List<List<String>> ans = new ArrayList<>(rules.values());
        return ans;
    }
}
