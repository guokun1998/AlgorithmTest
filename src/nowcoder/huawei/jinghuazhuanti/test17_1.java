package nowcoder.huawei.jinghuazhuanti;

import java.util.Arrays;
import java.util.Scanner;

public class test17_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            String[] strings = s.split(";");
            int x=0;
            int y=0;
            Loop1:
            for (int i = 0; i < strings.length; i++) {

                if (strings[i]!=null && strings[i].length()>0){
                    String s1 = strings[i];
                    char first = s1.charAt(0);
                    if (first == 'A'){
                        for (int j = 1; j < s1.length(); j++) {
                            if (!Character.isDigit(s1.charAt(j))){
                                continue Loop1;
                            }
                        }
                        x-=Integer.valueOf(s1.substring(1));
                    }
                    else if (first == 'S'){
                        for (int j = 1; j < s1.length(); j++) {
                            if (!Character.isDigit(s1.charAt(j))){
                                continue Loop1;
                            }
                        }
                        y-=Integer.valueOf(s1.substring(1));
                    }
                    else if (first == 'W'){
                        for (int j = 1; j < s1.length(); j++) {
                            if (!Character.isDigit(s1.charAt(j))){
                                continue Loop1;
                            }
                        }
                        y+=Integer.valueOf(s1.substring(1));
                    }
                    else if (first == 'D'){
                        for (int j = 1; j < s1.length(); j++) {
                            if (!Character.isDigit(s1.charAt(j))){
                                continue Loop1;
                            }
                        }
                        x+=Integer.valueOf(s1.substring(1));
                    }
                    else{
                        continue;
                    }
                }
            }
            System.out.println(x+" "+y);
        }
    }
}
