package after;

/**
 * 该接口 的意义是：
 * 该接口可以访问两个对象，一个是普通员工，一个是高层员工。
 * @Author: An
 * @Date: 2021/12/23 18:48
 */
public interface IVisitor {
    //首先， 定义我可以访问普通员工
    public void visit(CommonEmployee commonEmployee);
    //其次， 定义我还可以访问部门经理
    public void visit(Manager manager);
}
