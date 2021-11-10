package com.design.abstract_factory.create_people.factory;

import com.design.abstract_factory.create_people.Human;
import com.design.abstract_factory.create_people.human.FemaleBlackHuman;
import com.design.abstract_factory.create_people.human.FemaleWhiteHuman;
import com.design.abstract_factory.create_people.human.FemaleYellowHuman;

/**
 * @Author: An
 * @Date: 2021/11/4 15:49
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
