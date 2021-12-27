package after;

/**
 * @Author: An
 * @Date: 2021/12/21 16:20
 */
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    //采购IBM电脑
    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy", number);
    }
    //不再采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
