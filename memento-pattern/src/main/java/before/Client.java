package before;

/**
 * 缺点：
 * 一个状态的保存和恢复不应该要让高层模块来负责，破坏了Boy类的封装，或者说Boy类没有封装好，他应该
 * 是把backup的定义容纳进来，而不应该让高层模块来定义。
 * @Author: An
 * @Date: 2021/12/23 15:35
 */
public class Client {

    public static void main(String[] args) {
        //声明出主角
        Boy boy = new Boy();
        //初始化当前状态
        boy.setState("心情很棒！ ");
        System.out.println("=====男孩现在的状态======");
        System.out.println(boy.getState());
        //需要记录下当前状态呀
        Boy backup = new Boy();
        backup.setState(boy.getState());
        //男孩去追女孩， 状态改变
        boy.changeState();
        System.out.println("\n=====男孩追女孩子后的状态======");
        System.out.println(boy.getState());
        //追女孩失败， 恢复原状
        boy.setState(backup.getState());
        System.out.println("\n=====男孩恢复后的状态======");
        System.out.println(boy.getState());
    }
}
