package leetcode.T868;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().binaryGap(8));
    }

    public int binaryGap(int N) {
        String s = Integer.toBinaryString(N);

        int lastIndex = s.indexOf("1");
        if (lastIndex == -1 || lastIndex == s.length()-1)
            return 0;
        int nowIndex = s.indexOf("1",lastIndex+1);
        if (nowIndex == -1)
            return 0;

        int maxLength = nowIndex-lastIndex;
        lastIndex = nowIndex;
        for (int i = nowIndex+1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1'){
                nowIndex = i;
                if (maxLength < nowIndex-lastIndex) {
                    maxLength = nowIndex - lastIndex;
                }
                lastIndex = nowIndex;
            }

        }
        return maxLength;
    }
}
