package com.design.factory.store;

/**
 * @Author: An
 * @Date: 2021/11/3 14:46
 */
public abstract class AbstractCommodityFactory {
    public abstract <T extends ICommodity> T createCommodity(Class<T> c);
}
