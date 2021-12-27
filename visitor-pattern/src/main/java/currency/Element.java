package currency;

/**
 * @Author: An
 * @Date: 2021/12/23 18:55
 */
public abstract class Element {
    //定义业务逻辑
    public abstract void doSomething();
    //允许谁来访问
    public abstract void accept(IVisitor visitor);
}
