package currency;

/**
 * @Author: An
 * @Date: 2021/12/23 14:04
 */
public class ConcreteObserver implements Observer{

    //实现更新方法
    public void update() {
        System.out.println("接收到信息， 并进行处理！ ");
    }
}
