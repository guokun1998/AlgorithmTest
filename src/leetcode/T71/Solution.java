package leetcode.T71;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-19-13:55
 */
public class Solution {

    @Test
    public void test1(){
        simplifyPath("/home/");
    }

    StringBuilder res = new StringBuilder();
    public String simplifyPath(String path) {
        StringBuilder stringBuilder = new StringBuilder(path);
        StringBuilder stringBuilder1 = new StringBuilder();
        //去除///
        stringBuilder1.append("/");
        for (int i = 1; i < stringBuilder.length(); i++) {
            char c1 = stringBuilder.charAt(i);
            char c2 = stringBuilder.charAt(i-1);
            if (c1 == '/' && c1 == c2) {
                continue;
            }
            stringBuilder1.append(c1);
        }
        stringBuilder = stringBuilder1;
        String[] split = stringBuilder.toString().split("/");
        for (String s : split) {
            solve(s);
        }
        System.out.println(res);

        if (res.length() == 0)
            return "/";
        return res.toString();
    }
    private void solve(String s) {
        if (".".equals(s)) {
            if (res.length() == 0) {
                res.append("/");
            }
            return;
        }
        else if ("..".equals(s)) {
            if (res.length() == 0) {
                res.append("/");
            }
            else if (res.length() == 1) {
                return;
            }
            else {
                int index = res.lastIndexOf("/");
                res.delete(index,res.length());
            }
        }
        else {
            if (res.length() != 1) {
                res.append("/");
            }
            res.append(s);
        }
    }
}
