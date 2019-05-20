package pattern.factory.abstractFactory;

public class GoodTyre implements Tyre{
    @Override
    public void age() {
        System.out.println("寿命长");
    }
}
