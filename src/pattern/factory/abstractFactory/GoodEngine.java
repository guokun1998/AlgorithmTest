package pattern.factory.abstractFactory;

public class GoodEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转的快");
    }

    @Override
    public void start() {
        System.out.println("启动快");
    }
}
