package nowcoder.jianzhioffer;

public class test11_1 {
    public int NumberOf1(int n) {
        String s = Integer.toBinaryString(n);
//        System.out.println(s);
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('1' == s.charAt(i)){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        new test11_1().NumberOf1(-2);
    }
}
