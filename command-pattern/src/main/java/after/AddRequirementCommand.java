package after;

/**
 * @Author: An
 * @Date: 2021/12/21 19:17
 */
public class AddRequirementCommand extends Command{

    //执行增加一项需求的命令
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加一份需求super.rg.add();
        //给出计划
        super.rg.plan();
    }
}
