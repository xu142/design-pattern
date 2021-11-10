package com.design.abstract_factory.create_people.human;

/**
 * @Author: An
 * @Date: 2021/11/4 15:46
 */
public class FemaleBlackHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
