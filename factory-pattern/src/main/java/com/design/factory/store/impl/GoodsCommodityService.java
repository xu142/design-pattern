package com.design.factory.store.impl;

import com.design.factory.store.ICommodity;


/**
 * 实物发放接口
 * @Author: An
 * @Date: 2021/11/3 14:20
 */
public class GoodsCommodityService implements ICommodity {


    @Override
    public void sendCommodity(String uId, String commodityId, String businessId) throws Exception {
        System.out.println("实物发放接口--" + "用户Id：" + uId + "---商品Id：" + commodityId + "---业务Id" + businessId);
    }
}
