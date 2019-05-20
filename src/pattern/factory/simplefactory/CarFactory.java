package pattern.factory.simplefactory;

/**
 * 简单工厂，不符合开闭原则
 */

public class CarFactory {
    public Car createCar(String type){
        if (type.equals("奥迪")){
            return new Audi();
        } else if (type.equals("比亚迪")) {
            return new Byd();
        }
        return null;
    }
}
