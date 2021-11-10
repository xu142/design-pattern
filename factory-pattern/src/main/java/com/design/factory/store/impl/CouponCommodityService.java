package com.design.factory.store.impl;

import com.design.factory.store.ICommodity;
import com.design.factory.store.coupon.CouponService;

/**
 * 优惠券发放接口
 * @Author: An
 * @Date: 2021/11/3 14:07
 */
public class CouponCommodityService implements ICommodity {

    private CouponService couponService;

    @Override
    public void sendCommodity(String uId, String commodityId, String businessId) throws Exception {
        System.out.println("优惠券发放接口--" + "用户Id：" + uId + "商品Id：" + commodityId + "业务Id" + businessId);
    }
}
