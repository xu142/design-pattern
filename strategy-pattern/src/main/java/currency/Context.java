package currency;

/**
 * @Author: An
 * @Date: 2021/12/22 14:55
 */
public class Context {
    //抽象策略
    private Strategy strategy = null;
    //构造函数设置具体策略
    public Context(Strategy _strategy){
        this.strategy = _strategy;
    }
    //封装后的策略方法
    public void doAnythinig(){
        this.strategy.doSomething();
    }
}
