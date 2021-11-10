package com.design.abstract_factory.create_people.human;

import com.design.abstract_factory.create_people.Human;

/**
 * @Author: An
 * @Date: 2021/11/4 15:42
 */
public abstract class AbstractBlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑人黑色肤色");
    }

    @Override
    public void talk() {
        System.out.println("黑人talk");
    }
}
