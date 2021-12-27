package attention;

import currency.ClassA;
import currency.ClassC;

/**
 * @Author: An
 * @Date: 2021/12/23 15:27
 */
public class Context {
    //委托处理
    private ClassA a = new ClassA();
    private ClassC c = new ClassC();
    //复杂的计算
    public void complexMethod(){
        this.a.doSomethingA();
        this.c.doSomethingC();
    }
}
