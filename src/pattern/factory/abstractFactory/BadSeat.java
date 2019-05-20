package pattern.factory.abstractFactory;

public class BadSeat implements Seat {
    @Override
    public void massage() {
        System.out.println("不爽");
    }
}
