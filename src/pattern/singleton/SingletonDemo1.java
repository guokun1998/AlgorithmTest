package pattern.singleton;

/**
 * 标准双重校验
 */
public class SingletonDemo1 implements SingletonInterface {
    private volatile static SingletonDemo1 INSTANCE = null;
    private SingletonDemo1(){}

    public static SingletonDemo1 getInstance(){
        if (INSTANCE == null){
            synchronized (SingletonDemo1.class){
                if (INSTANCE == null){
                    INSTANCE = new SingletonDemo1();
                }
            }
        }
        return INSTANCE;
    }
}
