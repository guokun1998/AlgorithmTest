package pattern.factory.abstractFactory;

public class BadEngine implements Engine {
    @Override
    public void run() {
        System.out.println("转的慢，容易坏");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }
}
