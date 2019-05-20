package pattern.bridge;

public class Dell implements Brand {
    @Override
    public void sale() {
        System.out.println("戴尔品牌");
    }
}
