package leetcode.T125;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("1b1"));
    }
    public boolean isPalindrome(String s) {
        if (s.equals(""))
            return true;
        int i=0;
        int j=s.length()-1;
        while (i <= j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (c1 >= 'a' && c1 <= 'z') {
                int type = type(c2);
                if (type == 1) {
                    if (c1 != c2)
                        return false;
                }
                else if (type == 2) {
                    if (c1 != (c2-'A'+'a')) {
                        return false;
                    }
                }
                else if (type == 3) {
                    return false;
                }
                else {
                    j--;
                    continue;
                }
            }
            else if (c1 >= 'A' && c1 <= 'Z') {
                int type = type(c2);
                if (type == 1) {
                    if (c1 != (c2-'a'+'A'))
                        return false;
                }
                else if (type == 2) {
                    if (c1 != c2) {
                        return false;
                    }
                }
                else if (type == 3) {
                    return false;
                }
                else {
                    j--;
                    continue;
                }
            }
            else if (c1 >= '0' && c1 <= '9') {
                int type = type(c2);
                if (type == 3) {
                    if (c1 != c2) {
                        return false;
                    }
                }
                else if (type == 1 || type == 2) {
                    return false;
                }
                else {
                    j--;
                    continue;
                }
            }
            else {
                i++;
                continue;
            }
            i++;
            j--;
        }
        return true;
    }

    private int type(char c2) {
        if (c2 >= 'a' && c2 <= 'z') {
            return 1;
        }
        else if (c2 >= 'A' && c2 <= 'Z') {
            return 2;
        }
        else if (c2 >= '0' && c2 <= '9') {
            return 3;
        }
        else {
            return 4;
        }
    }
}
