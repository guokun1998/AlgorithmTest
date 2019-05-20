package pattern.factory.abstractFactory;

public class BadFatory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new BadEngine();
    }

    @Override
    public Seat createSeat() {
        return new BadSeat();
    }

    @Override
    public Tyre createTyre() {
        return new BadTyre();
    }
}
