package pattern.factory.abstractFactory;

public class GoodFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new GoodEngine();
    }

    @Override
    public Seat createSeat() {
        return new GoodSeat();
    }

    @Override
    public Tyre createTyre() {
        return new GoodTyre();
    }
}
