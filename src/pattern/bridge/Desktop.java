package pattern.bridge;

public class Desktop implements Computer{
    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}
