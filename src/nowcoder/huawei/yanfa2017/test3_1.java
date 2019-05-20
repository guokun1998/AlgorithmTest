package nowcoder.huawei.yanfa2017;

import java.util.Scanner;

public class test3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String in = scanner.next();
            String num = in.substring(2);
            int out = 0;
            int j = 0;
            for (int i = num.length()-1; i >= 0;i--) {
                String t = num.substring(i,i+1);
                if (t.equals("0")){
                    out += (0*Math.pow(16,j));
                }
                else if (t.equals("1")){
                    out += (1*Math.pow(16,j));
                }
                else if (t.equals("2")){
                    out += (2*Math.pow(16,j));
                }
                else if (t.equals("3")){
                    out += (3*Math.pow(16,j));
                }
                else if (t.equals("4")){
                    out += (4*Math.pow(16,j));
                }
                else if (t.equals("5")){
                    out += (5*Math.pow(16,j));
                }
                else if (t.equals("6")){
                    out += (6*Math.pow(16,j));
                }
                else if (t.equals("7")){
                    out += (7*Math.pow(16,j));
                }
                else if (t.equals("8")){
                    out += (8*Math.pow(16,j));
                }
                else if (t.equals("9")){
                    out += (9*Math.pow(16,j));
                }
                else if (t.equals("A")){
                    out += (10*Math.pow(16,j));
                }
                else if (t.equals("B")){
                    out += (11*Math.pow(16,j));
                }
                else if (t.equals("C")){
                    out += (12*Math.pow(16,j));
                }
                else if (t.equals("D")){
                    out += (13*Math.pow(16,j));
                }
                else if (t.equals("E")){
                    out += (14*Math.pow(16,j));
                }
                else if (t.equals("F")){
                    out += (15*Math.pow(16,j));
                }
                j++;
            }
            System.out.println(out);
        }
    }
}
