package leetcode.T22;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokun
 * @create 2019-05-26-9:19
 */
public class Solution {

//    Set<String> ans = new HashSet<>();
    List<String> ans = new ArrayList<>();


    @Test
    public void test1(){
        for (String generateParenthesis : generateParenthesis(3)) {
            System.out.println(generateParenthesis);
        }
    }

    public List<String> generateParenthesis(int n) {
        dg("",n,n,n);
//        List<String> re = new ArrayList<>();
//        re.addAll(ans);
        return ans;
    }

    private void dg(String temp, int leftNum, int rightNum, int n) {

        if (leftNum == rightNum) {
            if (leftNum == 1) {
                temp = temp +"()";
                ans.add(temp);
                return;
            }
            temp = temp+"(";
            dg(temp, leftNum-1, rightNum, n);
        }
        else{
            if (leftNum == 0) {
                for (int i = 0; i < rightNum; i++) {
                    temp = temp + ")";
                }
                ans.add(temp);
                return;
            }
            dg(temp+"(", leftNum-1, rightNum, n);
            dg(temp+")", leftNum, rightNum-1, n);

        }

    }
}
