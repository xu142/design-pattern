package currency;

/**
 * @Author: An
 * @Date: 2021/12/23 18:56
 */
public class ConcreteElement2 extends Element{
    //完善业务逻辑
    public void doSomething(){
        //业务处理
    }

    //允许那个访问者访问
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
