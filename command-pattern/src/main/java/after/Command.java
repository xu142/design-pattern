package after;

import before.CodeGroup;
import before.PageGroup;
import before.RequirementGroup;

/**
 * 抽象命令类
 * @Author: An
 * @Date: 2021/12/21 19:16
 */
public abstract class Command {
    //把三个组都定义好， 子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup(); //需求组
    protected PageGroup pg = new PageGroup(); //美工组
    protected CodeGroup cg = new CodeGroup(); //代码组
    //只有一个方法， 你要我做什么事情
    public abstract void execute();
}
