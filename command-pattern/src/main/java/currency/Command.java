package currency;

/**
 * @Author: An
 * @Date: 2021/12/21 19:25
 */
public abstract class Command {
    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
