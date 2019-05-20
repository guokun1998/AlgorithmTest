package pattern.flyweight;

/**
 * 享元类
 */
public interface ChessFlyWeight {
    void setColor(String color);
    String getColor();
    void display(Coordinate coordinate);
}
