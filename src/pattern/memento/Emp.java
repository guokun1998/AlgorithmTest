package pattern.memento;

/**
 * 源发器类
 */
public class Emp {
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    //进行备忘录操作，返回备忘录对象
    public EmpMemento memento(){
        return new EmpMemento(this);
    }

    //数据恢复
    public void recovery(EmpMemento empMemento) {
        this.age = empMemento.getAge();
        this.name = empMemento.getName();
        this.salary = empMemento.getSalary();
    }




    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
