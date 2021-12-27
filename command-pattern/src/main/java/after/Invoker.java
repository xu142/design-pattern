package after;

/**
 * 负责人
 * @Author: An
 * @Date: 2021/12/21 19:19
 */
public class Invoker {
    //什么命令
    private Command command;
    //客户发出命令
    public void setCommand(Command command){
        this.command = command;
    }
    //执行客户的命令
    public void action(){
        this.command.execute();
    }
}
