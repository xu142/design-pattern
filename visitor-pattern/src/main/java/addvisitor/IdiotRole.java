package addvisitor;


/**
 * @Author: An
 * @Date: 2021/12/24 11:16
 */
public class IdiotRole implements Role {
    //一个弱智角色， 由谁来扮演
    public void accept(AbsActor actor){
        actor.act(this);
    }
}
