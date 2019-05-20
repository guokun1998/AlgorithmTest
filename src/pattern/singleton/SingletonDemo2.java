package pattern.singleton;

/**
 * 标准内部类
 */
public class SingletonDemo2 implements SingletonInterface {
    private SingletonDemo2(){}

    private static class SingletonDemo2Holder{

        private static SingletonDemo2 INSTANCE = new SingletonDemo2();

    }

    public static SingletonDemo2 getInstance(){
        return SingletonDemo2Holder.INSTANCE;
    }

}
