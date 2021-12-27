package subject;

import java.lang.reflect.InvocationHandler;

/**
 * @Author: An
 * @Date: 2021/12/21 14:11
 */
public class SubjectDynamicProxy extends DynamicProxy{
    public static <T> T newProxyInstance(Subject subject) {
        // 获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        // 获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        // 获得Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
