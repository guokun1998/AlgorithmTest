package pattern.factory.factorymethod;

public class Client1 {

    public static void main(String[] args) {
        Car aodi = new AudiFactory().createCar();
        Car byd = new BydFactory().createCar();

        aodi.run();
        byd.run();

    }

}
