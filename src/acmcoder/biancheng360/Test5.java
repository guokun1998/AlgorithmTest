package acmcoder.biancheng360;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Test5 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int string2int(String str) {
        if (str == null || str.equals(""))
            return 0;
        int ans = 0;
        int flag = 1;
        String s = isLeagal(str);
        if (s.equals("no"))
            return 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            char c = s.charAt(i);
            ans = ans + flag*(c-'0');
            flag *= 10;
        }
        return ans;

    }
    static String isLeagal(String str){
        int point = str.indexOf('.');
        if (point == 0 || point == str.length()-1)
            return "no";
        if (point!=-1&& str.indexOf('.',point+1)!=-1)
            return "no";
        if (str.length() == 1 && str.charAt(0)=='0')
            return "0";
        if (str.charAt(0) == '0')
            return isLeagal(str.substring(1,str.length()));


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c <= '9' && c >= '0')
                continue;
            else if (c == '.'){

            }
            else
                return "no";
        }
        if (point == -1)
            return str;
        else
            return str.substring(0,point);

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _str = null;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }

        res = string2int(_str);
        System.out.println(String.valueOf(res));

    }
}
