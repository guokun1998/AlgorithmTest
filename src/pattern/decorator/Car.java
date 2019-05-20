package pattern.decorator;

public class Car implements ICar{
    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}
