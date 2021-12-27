package currency;

/**
 * @Author: An
 * @Date: 2021/12/23 14:03
 */
public class ConcreteSubject extends Subject{

    //具体的业务
    public void doSomething(){
        /*
         * do something
         */
        super.notifyObservers();
    }
}
