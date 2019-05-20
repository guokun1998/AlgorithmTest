package nowcoder.huawei.xyzp2016;

import java.util.ArrayList;
import java.util.Scanner;

public class test2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<mistake> mistakes = new ArrayList<>();
        while (scanner.hasNext()){
            String in = scanner.next();
//            if (in.equals("exit")){
//                break;
//            }
            int locationOfX = in.lastIndexOf("\\");
            int locationOfP = -1;
            String name;
            String orignName;
            if (locationOfX == -1){
                name = in;
            }
            else {
                name = in.substring(locationOfX+1,in.length());
            }
            orignName = in.substring(locationOfX+1,in.length());
            boolean isOver16;
            if (name.length() > 16){
                isOver16 = true;
                name = name.substring(name.length()-16);
            }
            else {
                isOver16 = false;
            }
            int line = scanner.nextInt();
            boolean isExistSame = false;
            for (mistake t:mistakes) {
                if (name.equals(t.name)&&line==t.line&&orignName.equals(t.orignName)){
                    t.times++;
                    isExistSame = true;
                    break;
                }
            }
            if (!isExistSame){
                mistakes.add(new mistake(name,orignName,line,1));
            }

        }
        ArrayList<mistake> result = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int maxTimes = mistakes.get(0).times;
            int locationOfMax = 0;
            for (int j = 1; j < mistakes.size(); j++) {
                int t = mistakes.get(j).times;
                if (t > maxTimes){
                    maxTimes = t;
                    locationOfMax = j;
                }
            }
            result.add(mistakes.get(locationOfMax));
            mistakes.remove(locationOfMax);
        }
        for (mistake m:result) {
            System.out.println(m.name+" "+m.line+" "+m.times);
        }
    }
}
class mistake{
    String name;
    String orignName;
    int line;
//    boolean isOver16;
    int times;
    public mistake(String name,String orignName,int line,int times){
        this.name = name;
        this.orignName = orignName;
        this.line = line;
//        this.isOver16 = isOver16;
        this.times = times;
    }

}

