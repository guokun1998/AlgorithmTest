package pattern.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 默认的clone方法浅克隆
 */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Date date;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Sheep(String name, Date date) {
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
