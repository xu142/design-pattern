package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: An
 * @Date: 2021/12/20 16:24
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
        // 如果是登录方法， 则发送信息
        // 将字符串与指定的对象比较 不考虑大小写
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登录");
        }
        return result;
    }
}
