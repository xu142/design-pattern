package currency;

/**
 * 执行者
 * @Author: An
 * @Date: 2021/12/21 19:26
 */
public class Invoker {

    private Command command;
    //受气包， 接受命令
    public void setCommand(Command _command){
        this.command = _command;
    }
    //执行命令
    public void action(){
        this.command.execute();
    }
}
