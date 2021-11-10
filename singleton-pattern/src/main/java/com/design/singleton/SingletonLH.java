package com.design.singleton;

/**
 * 懒汉式
 * @Author: An
 * @Date: 2021/11/3 16:03
 */
public class SingletonLH {

    private static SingletonLH instance;

    private SingletonLH(){}

    public static SingletonLH getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingletonLH();
        }
        return instance;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->
                    System.out.println(SingletonLH.getInstance().hashCode())
            ).start();
        }
    }
}
