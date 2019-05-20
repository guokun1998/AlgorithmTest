package leetcode.T242;

/**
 * @author guokun
 * @create 2019-05-20-20:02
 */
public class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (arr[c-'a'] == 0) {
                return false;
            }
            else {
                arr[c-'a']--;
            }
        }

        return true;
    }
}
