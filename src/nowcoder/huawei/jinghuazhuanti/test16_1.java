package nowcoder.huawei.jinghuazhuanti;

import java.util.*;

public class test16_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int value = 0;//记录总价值
            int cost = 0;//记录总花费
            int N = scanner.nextInt();
            int m = scanner.nextInt();
            PriorityQueue<MyThing> myThingsCouldBuy = new PriorityQueue<>();
            List<MyThing> myThings = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                MyThing temp = new MyThing(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                myThings.add(temp);
                if (temp.q == 0){
                    myThingsCouldBuy.add(temp);
                }
            }
            while (!myThingsCouldBuy.isEmpty()){
                MyThing maxValueMyThing = myThingsCouldBuy.poll();
                int t = cost + maxValueMyThing.price;
                if (N -t<0){
                    continue;
                }
                else {
                    value+=maxValueMyThing.level*maxValueMyThing.price;
                    cost += t;
                    int index = myThings.indexOf(maxValueMyThing);
                    for (MyThing tmmp :
                            myThings) {
                        if (tmmp.q == index) {
                            myThingsCouldBuy.add(tmmp);
                        }
                    }
                }

            }
            System.out.println(value);
        }
    }
}
class MyThing implements Comparable<MyThing>{
    int price;
    int level;
    int q;
    MyThing(int price,int level,int q){
        this.level = level;
        this.price = price;
        this.q = q;
    }

    @Override
    public int compareTo(MyThing o) {
        return o.price*o.level-this.price*this.level;
    }
}
