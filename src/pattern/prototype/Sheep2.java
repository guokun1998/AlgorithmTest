package pattern.prototype;

import java.util.Date;

/**
 * 改写clone方法，将部分属性重写，深克隆
 */
public class Sheep2 implements Cloneable{
    private String name;
    private Date date;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();

        Sheep2 sheep = (Sheep2) object;
        sheep.setDate((Date) this.date.clone());

        return sheep;
    }

    public Sheep2(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
