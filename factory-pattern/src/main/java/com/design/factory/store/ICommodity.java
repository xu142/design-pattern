package com.design.factory.store;


/**
 * 发奖接口
 * @Author: An
 * @Date: 2021/11/3 14:04
 */
public interface ICommodity {

    /**
     * 发奖接口
     * @param uId  用户id
     * @param commodityId 奖品Id
     * @param businessId 业务Id
     * @throws Exception exception
     */
    void sendCommodity(String uId, String commodityId, String businessId) throws Exception;
}
