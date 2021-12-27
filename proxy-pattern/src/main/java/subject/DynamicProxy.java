package subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: An
 * @Date: 2021/12/20 17:34
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        // 寻找JointPoint连接点， AOP 框架使用元数据定义
        if (true) {
            // 执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        // 执行目标 并返回结果
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
