package better;

import after.Boy;

/**
 * 需要备份的时候就创建一个备份，然后丢给备忘录管理员进行管理
 * 要取的时候再从管理员手中拿到这个备份。
 * 这个备份就类似与一个备份的仓库管理员，创建一个丢进去，需要的时候再拿出来，这就是备忘录模式
 * @Author: An
 * @Date: 2021/12/23 15:49
 */
public class Client {

    public static void main(String[] args) {
        //声明出主角
        Boy boy = new Boy();
        //声明出备忘录的管理者
        Caretaker caretaker = new Caretaker();
        //初始化当前状态
        boy.setState("心情很棒！ ");
        System.out.println("=====男孩现在的状态======");
        System.out.println(boy.getState());
        //需要记录下当前状态呀
        caretaker.setMemento(boy.createMemento());
        //男孩去追女孩， 状态改变
        boy.changeState();
        System.out.println("\n=====男孩追女孩子后的状态======");
        System.out.println(boy.getState());
        //追女孩失败， 恢复原状
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("\n=====男孩恢复后的状态======");
        System.out.println(boy.getState());
    }
}
