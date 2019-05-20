package pattern.proxy.staticProxy;

public class ProxyStar implements Star{

    private Star star = null;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void prepare() {
        System.out.println("我是代理,进行准备");

    }

    @Override
    public void sing() {
        System.out.println("我是代理,由本人亲自唱歌");
        star.sing();
    }

    @Override
    public void getMoney() {
        System.out.println("我是代理，进行收钱");
    }
}
