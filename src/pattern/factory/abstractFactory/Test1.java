package pattern.factory.abstractFactory;

public class Test1 {
    public static void main(String[] args) {
        CarFactory carFactory1 = new GoodFactory();
        Engine engine1 = carFactory1.createEngine();
        engine1.run();
    }
}
