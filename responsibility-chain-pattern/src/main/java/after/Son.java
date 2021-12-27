package after;

import before.IWomen;

/**
 * @Author: An
 * @Date: 2021/12/22 11:04
 */
public class Son extends Handler{
    //儿子只处理母亲的请求
    public Son(){
        super(Handler.SON_LEVEL_REQUEST);
    }
    //儿子的答复
    protected void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是： 同意\n");
    }

    @Override
    protected void rejected(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是:我排最后了\n");
    }
}
