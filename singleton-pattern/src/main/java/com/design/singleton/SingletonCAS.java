package com.design.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: An
 * @Date: 2021/11/4 10:37
 */
public class SingletonCAS {

    /**
     * 使用AtomicReference
     */
    private static final AtomicReference<SingletonCAS> INSTANCE = new AtomicReference<>();

    /**
     * 私有化
     */
    public SingletonCAS() {
    }

    /**
     * 用CAS保证线程安全
     * @return
     */
    public static final SingletonCAS getInstance() {
        for (; ;) {
            SingletonCAS instance = INSTANCE.get();
            if (instance != null) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new SingletonCAS());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(SingletonCAS.getInstance());

        System.out.println(SingletonCAS.getInstance());
    }
}
