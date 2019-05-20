package pattern.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        Star star = new ProxyStar(new RealStar()) ;
        star.prepare();
        star.sing();
        star.getMoney();
    }
}
