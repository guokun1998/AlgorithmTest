package pattern.prototype;

import java.io.*;
import java.util.Date;

/**
 * 使用序列化和反序列化进行深克隆，调用Sheep只实现了浅克隆,
 */
public class Client3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Date date = new Date(19980319);
        Sheep sheep1 = new Sheep("多莉",date);
        System.out.println(sheep1.getDate());

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(sheep1);
        byte[] bytes = byteArrayOutputStream.toByteArray();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Sheep sheep2 = (Sheep) objectInputStream.readObject();


        date.setTime(20190423);
        System.out.println(sheep1.getDate());
        System.out.println(sheep2.getDate());
    }
}
