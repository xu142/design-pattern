package com.design.singleton;

/**
 * 双重检查懒汉式(无Volatile)
 * @Author: An
 * @Date: 2021/11/3 16:32
 */
public class SingletonLHDoubleCheck {

    private static SingletonLHDoubleCheck instance;

    private SingletonLHDoubleCheck(){
    }

    public static SingletonLHDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonLHDoubleCheck.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new SingletonLHDoubleCheck();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(SingletonLHDoubleCheck.getInstance().hashCode());
            }).start();
        }
    }
}
