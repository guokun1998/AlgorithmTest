package pattern.prototype;

import java.util.Date;

/**
 * 测试深克隆
 */
public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(19980319);
        Sheep2 sheep1 = new Sheep2("多莉",date);
        System.out.println(sheep1.getDate());
        Sheep2 sheep2 = (Sheep2) sheep1.clone();
        date.setTime(20190423);
        System.out.println(sheep1.getDate());
        System.out.println(sheep2.getDate());
    }
}
