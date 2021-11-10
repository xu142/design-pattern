package com.design.singleton;

/**
 * 懒汉模式（线程安全）
 * @Author: An
 * @Date: 2021/11/3 16:08
 */
public class SingletonLHSync {

    private static SingletonLHSync instance;

    private SingletonLHSync(){}

    public static synchronized SingletonLHSync getInstance(){
        if (instance != null) {
            return instance;
        }
        instance = new SingletonLHSync();
        return instance;
    }
}
