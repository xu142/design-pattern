package better.encapsulation;

/**
 * @Author: An
 * @Date: 2021/12/23 17:09
 */
public class Caretaker {

    //备忘录对象
    private IMemento memento;
    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
