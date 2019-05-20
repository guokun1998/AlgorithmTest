package pattern.memento;

/**
 * 负责人类,管理备忘录对象
 */
public class CareTaker {
    private EmpMemento empMemento;

    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}
