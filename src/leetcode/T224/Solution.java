package leetcode.T224;

public class Solution {
    public int calculate(String s) {
        StringBuilder stringBuilder1 = new StringBuilder(s);
        int index1 = stringBuilder1.indexOf(")");
        if (index1 != -1){
            int index2 = stringBuilder1.substring(0, index1).indexOf("(");
            int t = calculateWithOutK(new StringBuilder(stringBuilder1.substring(index2 + 1, index1)));
            stringBuilder1.replace(index2,index1+1, String.valueOf(t));
        }
        else {
            int index2 = stringBuilder1.substring(0, index1).indexOf("(");
            int t = calculateWithOutK(new StringBuilder(stringBuilder1.substring(index2 + 1, index1)));
            stringBuilder1.replace(index2,index1+1, String.valueOf(t));
        }
        return 0;

    }
    public static int calculateWithOutK(StringBuilder s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(i, i + 1);
            if (s1.equals(" ")){
                continue;
            }
            else if (s1.equals("+")||s1.equals("-")){
                if (s1.contains("+")||s1.contains("-")){
                    int t = calculateOnce(stringBuilder);
                    stringBuilder.delete(0,stringBuilder.length());
                    stringBuilder.append(t);
                }
                stringBuilder.append(s1);
            }
            else if (i == s.length()-1){
                int t = calculateOnce(stringBuilder);
                return t;
            }
            else {
                stringBuilder.append(s1);
            }
        }
        return 0;
    }
    public static int calculateOnce(StringBuilder s){
        int index1 = s.indexOf("+");
        int index2 = s.indexOf("-");
        if (index1!=-1){
            return Integer.valueOf(s.substring(0,index1))+Integer.valueOf(s.substring(index1+1));
        }
        else {
            return Integer.valueOf(s.substring(0,index2))-Integer.valueOf(s.substring(index1+2));
        }
    }
}
