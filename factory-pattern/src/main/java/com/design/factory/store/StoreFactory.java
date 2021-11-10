package com.design.factory.store;

/**
 * @Author: An
 * @Date: 2021/11/3 14:29
 */
public class StoreFactory extends AbstractCommodityFactory{


    @Override
    public <T extends ICommodity> T createCommodity(Class<T> c) {
        ICommodity commodity = null;
        try {
            commodity = (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)commodity;
    }
}
