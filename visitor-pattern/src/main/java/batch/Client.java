package batch;

/**
 *
 * @Author: An
 * @Date: 2021/12/24 11:00
 */
public class Client {
    public static void main(String[] args) {
        //定义一个演员
        AbsActor actor = new OldActor();
        //定义一个角色
        Role role = new KungFuRole();
        Role role1 = new IdiotRole();
        //开始演戏
        actor.act(role);
        actor.act(role1);
        actor.act(new KungFuRole());
        // 虽然两者的真实类型相同，都是KungFuRole，但是实际上，他们的静态类型不同，
        // 重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了。

        // actor的静态类型是AbsActor，真实类型是OldActor。
        // 如果上面最后一行调用的是AbsActor，那么就是输出 “演员都可以演功夫角色”
        // 如果调用的是 OldActor，那么输出就是 “年龄大了， 不能演功夫角色”
    }
}
