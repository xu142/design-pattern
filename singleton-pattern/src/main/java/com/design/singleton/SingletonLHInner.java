package com.design.singleton;

/**
 * 使用类的内部类
 * @Author: An
 * @Date: 2021/11/3 17:04
 */
public class SingletonLHInner {

    // 内部类
    private static class SingletonHolder{
        private static SingletonLHInner instance = new SingletonLHInner();
    }

    public SingletonLHInner() {
    }

    public static SingletonLHInner getInstance(){
        return SingletonHolder.instance;
    }
}
