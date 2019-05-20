package pattern.decorator;

public class WaterCar extends SuperCar {
    public WaterCar(ICar iCar) {
        super(iCar);
    }

    void swim(){
        System.out.println("游泳");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
