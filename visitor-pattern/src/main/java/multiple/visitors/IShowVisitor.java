package multiple.visitors;


import after.IVisitor;

/**
 * @Author: An
 * @Date: 2021/12/24 10:47
 */
public interface IShowVisitor extends IVisitor {
    //展示报表
    public void report();
}
