package pattern.decorator;

public class FlyCar extends SuperCar {
    public FlyCar(ICar iCar) {
        super(iCar);
    }

    void fly(){
        System.out.println("飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
