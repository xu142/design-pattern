package com.design.factory.store.impl;

import com.design.factory.store.ICommodity;
import com.design.factory.store.coupon.CardService;

/**
 * 第三方兑换卡服务接口
 * @Author: An
 * @Date: 2021/11/3 14:14
 */
public class CardCommodityService implements ICommodity {

    private CardService cardService;

    @Override
    public void sendCommodity(String uId, String commodityId, String businessId) throws Exception {
        System.out.println("第三方兑换券发放接口--" + "用户Id：" + uId + "商品Id：" + commodityId + "业务Id" + businessId);
    }
}
