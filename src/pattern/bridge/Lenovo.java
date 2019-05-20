package pattern.bridge;

public class Lenovo implements Brand {
    @Override
    public void sale() {
        System.out.println("销售联想");
    }
}
