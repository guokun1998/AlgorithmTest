package pattern.singleton;

import java.io.Serializable;

/**
 * 防止反射 防止反序列化
 */
public class SingletonDemo3 implements Serializable {
    private volatile static SingletonDemo3 INSTANCE = null;
    private SingletonDemo3(){
        //防止反射
        if (INSTANCE != null){
            throw new RuntimeException();
        }
    }

    public static SingletonDemo3 getInstance(){
        if (INSTANCE == null){
            synchronized (SingletonDemo3.class){
                if (INSTANCE == null){
                    INSTANCE = new SingletonDemo3();
                }
            }
        }
        return INSTANCE;
    }

    //防止反序列化
    private Object readResolve(){
        return INSTANCE;
    }
}
