package pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class test1 {
    public static void main(String[] args) throws Exception {
        SingletonDemo3 s1 = SingletonDemo3.getInstance();
        SingletonDemo3 s2 = SingletonDemo3.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        //反射
//        Class<SingletonDemo3> clazz = (Class<SingletonDemo3>) Class.forName("pattern.singleton.SingletonDemo3");
//
//        Constructor<SingletonDemo3> declaredConstructor = clazz.getDeclaredConstructor(null);
//        declaredConstructor.setAccessible(true);
//        SingletonDemo3 s3 = declaredConstructor.newInstance();
//        SingletonDemo3 s4 = declaredConstructor.newInstance();
//        System.out.println(s3);
//        System.out.println(s4);


        //序列化
        FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(s1);
        objectOutputStream.close();
        fileOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("text.txt"));
        SingletonDemo3 s3 = (SingletonDemo3) objectInputStream.readObject();
        System.out.println(s3);


    }
}
