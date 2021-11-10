package com.design.abstract_factory.create_people.factory;

import com.design.abstract_factory.create_people.Human;
import com.design.abstract_factory.create_people.human.MaleBlackHuman;
import com.design.abstract_factory.create_people.human.MaleWhiteHuman;
import com.design.abstract_factory.create_people.human.MaleYellowHuman;

/**
 * @Author: An
 * @Date: 2021/11/4 15:49
 */
public class MaleFactory implements HumanFactory {
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
