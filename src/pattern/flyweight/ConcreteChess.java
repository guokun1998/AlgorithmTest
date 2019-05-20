package pattern.flyweight;

/**
 * 具体享元类
 */
public class ConcreteChess implements ChessFlyWeight{

    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色"+color);
        System.out.println("棋子位置x:"+coordinate.getX()+" y:"+coordinate.getY());
    }
}
