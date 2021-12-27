package multiple.visitors;

import after.IVisitor;

/**
 * @Author: An
 * @Date: 2021/12/24 10:49
 */
public interface ITotalVisitor extends IVisitor {
    //统计所有员工工资总和
    public void totalSalary();
}
