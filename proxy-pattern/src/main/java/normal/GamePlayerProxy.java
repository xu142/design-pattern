package normal;

/**
 * @Author: Xiao An
 * @Description:    代练
 * @Date Created in 2021--12--09 23:27
 * @Modified By:
 */

public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;
    //通过构造函数传递要对谁进行代练


    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
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
}
