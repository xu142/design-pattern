package attention.deep;


import attention.shallow.Thing;

/**
 * 深拷贝测试
 * @Author: An
 * @Date: 2021/12/21 15:26
 */
public class Client {
    public static void main(String[] args) {
        //产生一个对象
        attention.shallow.Thing thing = new attention.shallow.Thing();
        //设置一个值
        thing.setValue("张三");
        //拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        // 出现结果是张三吗？
        System.out.println(thing.getValue());
    }
}
