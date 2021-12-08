import java.util.ArrayList;

/**
 * @Author: Xiao An
 * @Description: 车辆模型的抽象类
 * @Date Created in 2021--12--08 23:15
 * @Modified By:
 */

public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<String>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    final public void run() {
        //循环一边，谁在前，就先执行谁
        for(int i=0;i<this.sequence.size();i++){
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
                //启动汽车
            }else if(actionName.equalsIgnoreCase("stop")){
                this.stop(); //停止汽车
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm(); //喇叭开始叫了
            }else if(actionName.equalsIgnoreCase("engine boom")){
                //如果是engine boom关键字
                this.engineBoom(); //引擎开始轰鸣
                }
        }
    }
    //把传递过来的值传递到类内
    final public void setSequence(ArrayList sequence){ this.sequence = sequence; }
}
