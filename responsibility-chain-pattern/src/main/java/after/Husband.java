package after;

import before.IWomen;

/**
 * @Author: An
 * @Date: 2021/12/22 11:03
 */
public class Husband extends Handler{
    //丈夫只处理妻子的请求
    public Husband(){super(Handler.HUSBAND_LEVEL_REQUEST);
    }
    //丈夫请示的答复
    protected void response(IWomen women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是： 同意\n");
    }

    @Override
    protected void rejected(IWomen women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是:我人没了，问儿子\n");
    }
}
