package subject;

import java.lang.reflect.InvocationHandler;

/**
 * @Author: An
 * @Date: 2021/12/21 10:25
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个主题
        Subject subject = new RealSubject();
        // 定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        // 定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);
        // 代理的行为
        proxy.doSomething("finish");
    }
}
