package pattern.bridge;

public class Laptop implements Computer{
    @Override
    public void sale() {
        System.out.println("销售台笔记本");
    }
}
