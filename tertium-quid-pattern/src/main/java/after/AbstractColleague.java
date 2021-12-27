package after;

/**
 * 抽象同事类
 * @Author: An
 * @Date: 2021/12/21 16:19
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator){
        this.mediator = _mediator;
    }
}
