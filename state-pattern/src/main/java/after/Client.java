package after;

/**
 * 程序问题：
 * 电梯实现类Lift有点长
 * 扩展性非常差
 * 非常规状态无法实现
 * @Author: An
 * @Date: 2021/12/24 14:55
 */
public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        //电梯的初始条件应该是停止状态
        lift.setState(ILift.STOPPING_STATE);
        //首先是电梯门开启， 人进去
        lift.open();
        //然后电梯门关闭
        lift.close();
        //再然后， 电梯运行起来， 向上或者向下
        lift.run();
        //最后到达目的地， 电梯停下来
        lift.stop();
    }
}
