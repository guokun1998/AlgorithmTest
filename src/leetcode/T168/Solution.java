package leetcode.T168;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(28));
    }
    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n != 0) {
            int t = n % 26;
            if (t == 0)
                t = 26;
            n = (n-t)/26;
            stringBuilder.append((char)('A'+t-1));
        }
        return stringBuilder.reverse().toString();
    }
}
