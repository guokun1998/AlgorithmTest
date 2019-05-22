package leetcode.T290;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author guokun
 * @create 2019-05-22-10:42
 * 一一映射。
 * 执行用时 : 2 ms, 在Word Pattern的Java提交中击败了94.86% 的用户
 * 内存消耗 : 33.8 MB, 在Word Pattern的Java提交中击败了50.32% 的用户
 * 建立string[26]记录单个字符到字符串的映射
 * 建立hashset记录已映射过的string
 */

public class Solution {

    @Test
    public void test1(){
        System.out.println(wordPattern("deadbeef", "d e a d b e e f"));
    }


    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        HashSet<String> set = new HashSet<>();
        if (pattern.length() != strings.length) {
            return false;
        }
        String[] strs = new String[26];
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (strs[c-'a'] == null) {
                if (set.contains(strings[i])) {
                    return false;
                }
                else {
                    strs[c-'a'] = strings[i];
                    set.add(strings[i]);
                }
            }
            else {
                if (!strs[c-'a'].equals(strings[i])) {
                    return false;
                }
            }

        }
        return true;
    }
}
