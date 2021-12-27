package normalproxy;

import normal.IGamePlayer;

/**
 * @Author: Xiao An
 * @Description:
 * @Date Created in 2021--12--13 23:26
 * @Modified By:
 */

public class GamePlayer implements IGamePlayer {
    private String name = "";
    //构造函数限制谁能创建对象，并同时传递姓名
    public GamePlayer(IGamePlayer _gamePlayer,String _name) throws Exception{
        // 限制条件 检查谁能创建真实的角色
        if(_gamePlayer == null ){
            throw new Exception("不能创建真实角色！");
        }else{
            this.name = _name;
        }
    }
    //打怪，最期望的就是杀老怪
    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }
    //进游戏之前你肯定要登录吧，这是一个必要条件
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为"+user + "的用户" + this.name + "登录成功！");
    }
    //升级，升级有很多方法，花钱买是一种，做任务也是一种
    @Override
    public void upgrade() { System.out.println(this.name + " 又升了一级！"); }
}
