package attention.shallow;

/**
 * 浅拷贝测试
 * Java做了一个偷懒的拷贝动作，Object类提供的方法clone只是拷贝本对象，其对象内杯的数组、引用对象等都不拷贝，还是指向原生对象的
 * 内部元素地址，这种拷贝就叫做浅拷贝。
 */

/**
 * 浅拷贝测试
 * @Author: An
 * @Date: 2021/12/21 15:26
 */
public class ShallowClient {
    public static void main(String[] args) {
        //产生一个对象
        Thing thing = new Thing();
        //设置一个值
        thing.setValue("张三");
        //拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        // 出现结果是张三吗？
        System.out.println(thing.getValue());
    }
}
