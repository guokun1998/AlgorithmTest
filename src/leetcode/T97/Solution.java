package leetcode.T97;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-06-27-8:40
 */
public class Solution {

    @Test
    public void test1(){
        System.out.println(isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        System.out.println(isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        return true;
    }


    //递归版

//    public boolean isInterleave(String s1, String s2, String s3) {
//        if (s1.length()+s2.length() != s3.length()) {
//            return false;
//        }
//        if (s1.equals("")) {
//            return s2.equals(s3);
//        }
//        else if (s2.equals("")) {
//            return s1.equals(s3);
//        }
//        char c1 = s1.charAt(0);
//        char c2 = s2.charAt(0);
//        char c3 = s3.charAt(0);
//        if (c1 == c3 && c2 == c3) {
//            return isInterleave(s1.substring(1),s2,s3.substring(1)) || isInterleave(s1,s2.substring(1),s3.substring(1));
//        }
//        else if (c1 == c3) {
//            return isInterleave(s1.substring(1),s2,s3.substring(1));
//        }
//        else if (c2 == c3) {
//            return isInterleave(s1,s2.substring(1),s3.substring(1));
//        }
//        else {
//            return false;
//        }
//    }
}
