package better;


import after.Memento;

/**
 * @Author: An
 * @Date: 2021/12/23 15:46
 */
public class Caretaker {
    //备忘录对象
    private Memento memento;
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
