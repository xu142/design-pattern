package addvisitor;

/**
 * 重载
 * @Author: An
 * @Date: 2021/12/24 10:58
 */
public abstract class AbsActor {
    //演员都能够演一个角色
    public void act(Role role) {
        System.out.println("演员可以扮演任何角色");
    }

    //可以演功夫戏
    public void act(KungFuRole role) {
        System.out.println("演员都可以演功夫角色");
    }
}
