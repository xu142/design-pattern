package staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Xiao An
 * @Description:
 * @Date Created in 2021--12--13 23:14
 * @Modified By:
 */

public class GamePlayIH implements InvocationHandler {

    // 被代理者
    Class cls = null;
    // 被代理的实例
    Object obj = null;
    // 我要代理谁
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    // 调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
