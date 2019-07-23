package leetcode.T93;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-07-23-10:08
 */
public class Solution {
    @Test
    public void test1(){
        restoreIpAddresses("0000");
//        restoreIpAddresses("25525511135");
        for (String an : ans) {
            System.out.println(an);
        }
    }
    List<String> ans = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        solve(0,s,new StringBuilder());
        return ans;
    }

    private void solve(int time,String s,StringBuilder temp) {
        if (s.length() <= 0) {
            return;
        }
        if (time == 0) {
            if (s.length() > 12) {
                return;
            }
            solve1(0,s,temp);
        }
        if (time == 1) {
            if (s.length() > 9) {
                return;
            }
            temp.append(".");
            solve1(1,s,temp);
        }
        if (time == 2) {
            if (s.length() > 6) {
                return;
            }
            temp.append(".");
            solve1(2,s,temp);
        }
        if (time == 3) {
            if (s.length() > 3) {
                return;
            }
            temp.append(".");
            if (s.length() != 1 && s.charAt(0) == '0') {
                return;
            }
            if (Integer.valueOf(s) <= 255) {
                temp.append(s);
                ans.add(temp.toString());
            }
        }
    }

    private void solve1(int time,String s,StringBuilder temp) {
        //1位
        StringBuilder temp1 = new StringBuilder(temp);
        temp1.append(s, 0, 1);
        solve(time+1,s.substring(1),temp1);
        //2位
        if (s.length()<2) {
            return;
        }
        if (s.charAt(0) == '0') {
            return;
        }
        StringBuilder temp2 = new StringBuilder(temp);
        temp2.append(s, 0, 2);
        solve(time+1,s.substring(2),temp2);
        //3位
        if (s.length() < 3) {
            return;
        }
        String substring = s.substring(0,3);
        if (Integer.valueOf(substring) <= 255) {
            StringBuilder temp3 = new StringBuilder(temp);
            temp3.append(s, 0, 3);
            solve(time+1,s.substring(3),temp3);
        }
    }
}
