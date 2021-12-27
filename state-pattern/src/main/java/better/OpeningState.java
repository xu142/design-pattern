package better;

/**
 * @Author: An
 * @Date: 2021/12/24 15:07
 */
public class OpeningState extends LiftState{

    //开启当然可以关闭了， 我就想测试一下电梯门开关功能
    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.closingState);
        //动作委托为CloseState来执行
        super.context.getLiftState().close();
    }
    //打开电梯门
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }
    //门开着时电梯就运行跑， 这电梯， 吓死你！
    @Override
    public void run() {
        //do nothing;
    }
    //开门还不停止？
    public void stop() {
        //do nothing;
    }
}
