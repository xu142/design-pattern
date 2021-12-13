package force;

/**
 * @Author: Xiao An
 * @Description:
 * @Date Created in 2021--12--13 23:45
 * @Modified By:
 */

public interface IGamePlayer {
    /**
     *     登录游戏
     */
    public void login(String user,String password);

    /**
     * 杀怪，这是网络游戏的主要特色
     */
    public void killBoss();

    /**
     * 升级
     */
    public void upgrade();

    /**
     * 每个人都可以找一下自己的代理
     * @return
     */
    public IGamePlayer getProxy();
}
