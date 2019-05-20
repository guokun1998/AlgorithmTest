package pattern.memento;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Emp emp = new Emp("gg",18,2000);
        System.out.println(emp);
        careTaker.setEmpMemento(emp.memento()); //备忘
        emp.setName("kk");
        System.out.println(emp);
        emp.recovery(careTaker.getEmpMemento());//恢复
        System.out.println(emp);

    }
}
