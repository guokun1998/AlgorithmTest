package pattern.factory.abstractFactory;

public class GoodSeat implements Seat {
    @Override
    public void massage() {
        System.out.println("爽");
    }
}
