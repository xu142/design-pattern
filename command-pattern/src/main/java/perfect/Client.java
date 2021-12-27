package perfect;
/**
 * 高层次的模块不需要知道接收者。
 */

/**
 * @Author: An
 * @Date: 2021/12/22 10:11
 */
public class Client {
    public static void main(String[] args) {
        //首先声明调用者Invoker
        Invoker invoker = new Invoker();
        //定义一个发送给接收者的命令
        Command command = new ConcreteCommand1();
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
