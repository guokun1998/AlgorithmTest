package pattern.singleton;

public class SingletonDemo4 {
    private SingletonDemo4(){}

    private static class SingletonDemo2Holder{

        private static SingletonDemo4 INSTANCE = new SingletonDemo4();

    }

    public static SingletonDemo4 getInstance(){
        return SingletonDemo2Holder.INSTANCE;
    }

}
