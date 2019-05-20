package leetcode.T299;

public class Solution {
    public static void main(String[] args) {
        new Solution().getHint("1807","7810");
    }
    public String getHint(String secret, String guess) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            String s1 = secret.substring(i, i + 1);
            String s2 = guess.substring(i, i + 1);
            if (s1.equals(s2)){
                bulls++;
            }
            else {
                stringBuilder1.append(s1);
                stringBuilder2.append(s2);
            }
        }
        for (int i = 0; i < stringBuilder2.length(); i++) {
            String s = stringBuilder2.substring(i, i + 1);
            int index = stringBuilder1.indexOf(s);
            if (index != -1){
                cows++;
                stringBuilder1.deleteCharAt(index);
            }
        }
        return bulls+"A"+cows+"B";
    }
}
