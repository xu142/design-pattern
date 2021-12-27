package currency;
/**
 * 原始方法和装饰方法的执行顺序 在具体的装饰类是固定的，可以通过方法重载实现多种执行顺序
 */

/**
 * @Author: An
 * @Date: 2021/12/22 14:12
 */
public class ConcreteDecorator2 extends Decorator{
    //定义被修饰者
    public ConcreteDecorator2(Component _component){
        super(_component);
    }
    //定义自己的修饰方法
    private void method2(){
        System.out.println("method2修饰");
    }
    //重写父类的Operation方法
    public void operate(){
        super.operate();
        this.method2();
    }
}
