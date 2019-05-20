package pattern.bridge;

public class Pad implements Computer{
    @Override
    public void sale() {
        System.out.println("销售平板电脑");
    }
}
