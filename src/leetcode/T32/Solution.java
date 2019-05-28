package leetcode.T32;

import org.junit.Test;

/**
 * @author guokun
 * @create 2019-05-27-14:05
 */
public class Solution {
    int max = 0;

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    @Test
    public void test1(){
//        System.out.println(longestValidParentheses("()()())"));
//        max=0;
//        System.out.println(longestValidParentheses(")()()())"));
//        max=0;
//        System.out.println(longestValidParentheses(")"));
//        max=0;
//        System.out.println(longestValidParentheses("("));
//        max=0;
//        System.out.println(longestValidParentheses("()"));
//        max=0;
        System.out.println(longestValidParentheses("()(()"));
    }
    @Test
    public void test2(){
//        System.out.println(lVP("()("));
//        System.out.println(lVP("(()("));
//        System.out.println(lVP("(())"));
        System.out.println(lVP(")()())"));
    }

    public int longestValidParentheses(String s) {
        findFirstLegal(s,'(');
        int max1 = this.max;
        max = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ')') {
                stringBuilder.append("(");
            }
            else {
                stringBuilder.append(")");
            }
        }
        findFirstLegal(stringBuilder.toString(),'(');
        int max2 = this.max;
        return 2*Math.min(max1,max2);
    }

    private void findFirstLegal(String s, char left) {
        StringBuilder ans = new StringBuilder();
        int numLeft = 0;
        int nowNum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == left) {
                numLeft++;
            }
            else {
                if (numLeft > s.length()-i) {

                }
                if (numLeft != 0) {
                    numLeft--;
                    nowNum++;
                }
                else {
                    if (i == s.length()-1) {
                        max = max > nowNum ? max : nowNum;
                        return;
                    }
                    findFirstLegal(s.substring(i+1),left);
                    return;
                }
            }
        }
        max = max > nowNum ? max : nowNum;
    }

    /**
     * 执行用时 : 21 ms, 在Longest Valid Parentheses的Java提交中击败了35.32% 的用户
     * 内存消耗 : 36.8 MB, 在Longest Valid Parentheses的Java提交中击败了86.66% 的用户
     * @param s
     * @return
     */
    private int lVP(String s) {
        boolean[] isDelete  = new boolean[s.length()];
        boolean isChange;
        while (true) {
            isChange = false;
            for (int i = 0; i < s.length(); i++) {
                if (isDelete[i])
                    continue;
                char c = s.charAt(i);
                if (c == '(') {
                    for (int j = i+1; j < s.length(); j++) {
                        if (!isDelete[j]) {
                            if (s.charAt(j) == ')') {
                                isDelete[i] = true;
                                isDelete[j] = true;
                                isChange = true;
                            }
                            break;
                        }
                    }
                }
            }
            if (!isChange)
                break;
        }
        int maxLength = 0;
        int nowLength = 0;
        for (boolean b : isDelete) {
            if (b) {
                nowLength++;
            }
            else {
                maxLength = maxLength > nowLength ? maxLength : nowLength;
                nowLength = 0;
            }
        }
        maxLength = maxLength > nowLength ? maxLength : nowLength;
        return maxLength;
    }


}
