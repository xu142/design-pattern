package com.design.singleton;

/**
 * 双重检查懒汉式(Volatile)
 * @Author: An
 * @Date: 2021/11/3 16:32
 */
public class SingletonLHDoubleCheckVolatile {

    private static SingletonLHDoubleCheckVolatile instance;

    private SingletonLHDoubleCheckVolatile(){
    }

    public static SingletonLHDoubleCheckVolatile getInstance() {
        if (instance == null) {
            synchronized (SingletonLHDoubleCheckVolatile.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new SingletonLHDoubleCheckVolatile();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(SingletonLHDoubleCheckVolatile.getInstance().hashCode());
            }).start();
        }
    }
}
