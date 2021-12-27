package currency;

/**
 * 抽象同事类
 * @Author: An
 * @Date: 2021/12/21 17:25
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator _mediator){
        this.mediator = _mediator;
    }
}
