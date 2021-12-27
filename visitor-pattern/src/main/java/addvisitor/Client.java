package addvisitor;


/**
 * @Author: An
 * @Date: 2021/12/24 11:18
 */
public class Client {
    public static void main(String[] args) {
        //定义一个演员
        AbsActor actor = new OldActor();
        //定义一个角色
        Role role = new KungFuRole();
        //开始演戏
        role.accept(actor);
    }
}
