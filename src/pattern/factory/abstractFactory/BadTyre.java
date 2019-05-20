package pattern.factory.abstractFactory;

public class BadTyre implements Tyre {
    @Override
    public void age() {
        System.out.println("寿命短");
    }
}
