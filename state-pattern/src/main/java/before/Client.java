package before;

/**
 * 问题：
 * 电梯门可以打开，但是有前提条件。不可能电梯运行时开门，也不会停止了但是不开门。
 * 也就是说，电梯的这四个动作的执行都有前置条件的，在特定状态下才能做特定事。
 *
 * @Author: An
 * @Date: 2021/12/24 14:49
 */
public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        //首先是电梯门开启， 人进去
        lift.open();
        //然后电梯门关闭lift.close();
        //再然后， 电梯运行起来， 向上或者向下
        lift.run();
        //最后到达目的地， 电梯停下来
        lift.stop();
    }
}
