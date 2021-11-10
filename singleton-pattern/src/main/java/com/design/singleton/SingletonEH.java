package com.design.singleton;

/**
 * 饿汉模式
 * @Author: An
 * @Date: 2021/11/3 15:35
 */
public class SingletonEH {

    private static SingletonEH instance = new SingletonEH();

    // 私有构造函数，不能被实例化，限制产生多个对象
    private SingletonEH(){}

    // 通过该方法获得实例对象
    public static SingletonEH getInstance() {
        return instance;
    }
}
