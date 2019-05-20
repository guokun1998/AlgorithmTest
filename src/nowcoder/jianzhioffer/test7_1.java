package nowcoder.jianzhioffer;

public class test7_1 {
    public int Fibonacci(int n) {
        int a = 0;
        int b = 1;
        if (n == 0){
            return a;
        }
        else if (n == 1)
            return b;
        int last1 = a;
        int last2 = b;
        int result = 0;
        for (int i = 2; i < n+1; i++) {
            result = last1+last2;
            last1 = last2;
            last2 = result;
        }
        return result;
    }
}
