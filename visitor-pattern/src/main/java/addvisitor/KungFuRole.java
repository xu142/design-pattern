package addvisitor;

/**
 * @Author: An
 * @Date: 2021/12/24 11:15
 */
public class KungFuRole implements Role {
    //武功天下第一的角色
    public void accept(AbsActor actor){
        actor.act(this);
    }
}
