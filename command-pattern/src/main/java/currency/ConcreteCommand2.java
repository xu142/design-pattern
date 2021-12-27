package currency;

/**
 * @Author: An
 * @Date: 2021/12/21 19:25
 */
public class ConcreteCommand2 extends Command{
    //对哪个Receiver类进行命令处理
    private Receiver receiver;
    //构造函数传递接收者
    public ConcreteCommand2(Receiver _receiver){
        this.receiver = _receiver;
    }
    //必须实现一个命令
    public void execute() {
    //业务处理
        this.receiver.doSomething();
    }
}
