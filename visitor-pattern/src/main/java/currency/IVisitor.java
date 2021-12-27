package currency;

/**
 * @Author: An
 * @Date: 2021/12/23 18:57
 */
public interface IVisitor {
    //可以访问哪些对象
    public void visit(ConcreteElement1 el1);
    public void visit(ConcreteElement2 el2);
}
