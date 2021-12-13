package normalproxy;

import normal.IGamePlayer;

import java.time.LocalDate;

/**
 * @Author: Xiao An
 * @Description:
 * @Date Created in 2021--12--13 23:38
 * @Modified By:
 */

public class Client {
    public static void main(String[] args) {
        // 然后再定义一个代练者
        IGamePlayer proxy = new GamePlayProxy("张三");
        // 开始打游戏 记下时间戳
        System.out.println( LocalDate.now());
        proxy.login("张三", "password");
        // 开始杀怪
        proxy.killBoss();
        // 开始升级
        proxy.upgrade();
        // 记录游戏结束时间
        System.out.println(LocalDate.now());
    }
}
