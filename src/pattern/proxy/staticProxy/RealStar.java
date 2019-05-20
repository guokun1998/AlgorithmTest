package pattern.proxy.staticProxy;

public class RealStar implements Star{
    @Override
    public void prepare() {
        System.out.println("本人准备");
    }

    @Override
    public void sing() {
        System.out.println("本人唱歌");
    }

    @Override
    public void getMoney() {
        System.out.println("本人收钱");
    }
}
