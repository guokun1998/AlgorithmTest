package pattern.prototype;

import java.util.Date;

/**
 * 测试默认的clone方法浅克隆，结果改日期都改
 */
public class Client1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(19980319);
        Sheep sheep1 = new Sheep("多莉",date);
        System.out.println(sheep1.getDate());
        Sheep sheep2 = (Sheep) sheep1.clone();
        date.setTime(20190423);
        System.out.println(sheep1.getDate());
        System.out.println(sheep2.getDate());
    }
}
