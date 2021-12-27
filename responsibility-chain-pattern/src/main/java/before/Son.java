package before;

/**
 * @Author: An
 * @Date: 2021/12/22 10:56
 */
public class Son implements IHandler{
    //母亲向儿子请示
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是： "+women.getRequest());
        System.out.println("儿子的答复是： 同意");
    }
}
