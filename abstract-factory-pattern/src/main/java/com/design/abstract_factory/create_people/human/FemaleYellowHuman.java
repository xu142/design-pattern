package com.design.abstract_factory.create_people.human;

/**
 * @Author: An
 * @Date: 2021/11/4 15:46
 */
public class FemaleYellowHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("黄种人女性");
    }
}
