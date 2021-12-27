package addvisitor;

/**
 * @Author: An
 * @Date: 2021/12/24 11:15
 */
public interface Role {
    //演员要扮演的角色
    public void accept(AbsActor actor);
}
