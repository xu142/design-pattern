package force;

/**
 * @Author: Xiao An
 * @Description:
 * @Date Created in 2021--12--13 23:51
 * @Modified By:
 */

public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    //构造函数传递用户名
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
