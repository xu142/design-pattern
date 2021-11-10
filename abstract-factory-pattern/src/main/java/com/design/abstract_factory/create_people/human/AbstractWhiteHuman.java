package com.design.abstract_factory.create_people.human;

import com.design.abstract_factory.create_people.Human;

/**
 * @Author: An
 * @Date: 2021/11/4 15:42
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白人白色肤色");
    }

    @Override
    public void talk() {
        System.out.println("白人talk");
    }
}
