import com.design.factory.store.ICommodity;
import com.design.factory.store.StoreFactory;
import com.design.factory.store.impl.GoodsCommodityService;
import com.sun.tracing.dtrace.Attributes;
import org.junit.Test;

import java.lang.annotation.Target;

/**
 * @Author: An
 * @Date: 2021/11/3 14:50
 */
public class CreateCommodity {

    @Test
    public void test_commodity() throws Exception {
        StoreFactory storeFactor = new StoreFactory();
        ICommodity commodity = storeFactor.createCommodity(GoodsCommodityService.class);
        String uId = "111";
        String commodityId = "A111111";
        String bussinessId = "Goods";
        commodity.sendCommodity(uId, commodityId, bussinessId);

    }
}
