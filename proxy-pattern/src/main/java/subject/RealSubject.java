package subject;

/**
 * @Author: An
 * @Date: 2021/12/20 17:30
 */
public class RealSubject implements Subject{

    // 业务操作
    @Override
    public void doSomething(String str) {
        System.out.println("do something!" + str);
    }
}
