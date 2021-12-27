package after;

/**
 * 迪米特法则告诉我们只和朋友类通信，
 * 对高层模块来说，最希望做的是创建一个备份点，然后在需要的时候再恢复到这个备份点就可以了，不用关心到底有没有备忘录这个类。
 * 所以需要把备忘录类再包装一下。建立一个管理类，管理这个备忘录。
 * @Author: An
 * @Date: 2021/12/23 15:40
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
        Memento mem = boy.createMemento();
        //男孩去追女孩， 状态改变
        boy.changeState();
        System.out.println("\n=====男孩追女孩子后的状态======");
        System.out.println(boy.getState());
        //追女孩失败， 恢复原状
        boy.restoreMemento(mem);
        System.out.println("\n=====男孩恢复后的状态======");
        System.out.println(boy.getState());
    }
}
