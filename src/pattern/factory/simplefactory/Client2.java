package pattern.factory.simplefactory;

/**
 * 简单工厂测试
 */
public class Client2 {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.createCar("奥迪").run();
        carFactory.createCar("比亚迪").run();
    }
}
