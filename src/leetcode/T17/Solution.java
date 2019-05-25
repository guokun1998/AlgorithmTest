package leetcode.T17;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-05-25-10:36
 */
public class Solution {
    String[] table = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> ans = new ArrayList<>();

    @Test
    public void test1(){
        for (String letterCombination : letterCombinations("23")) {
            System.out.println(letterCombination);
        }
    }


    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.equals(""))
            return ans;
        dg(digits,"");
        return ans;
    }

    private void dg(String digits, String temp) {
        if (digits.length() == 0) {
            ans.add(temp);
            return;
        }
        char c = digits.charAt(0);
        int num = c-'1';
        String s = table[num];
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            dg(digits.substring(1),temp+c1);
        }
    }
}
