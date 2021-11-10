package com.design.abstract_factory.create_people.factory;

import com.design.abstract_factory.create_people.Human;

/**
 * @Author: An
 * @Date: 2021/11/4 15:47
 */
public interface HumanFactory {

    /**
     * 制造白人
     * @return
     */
    public Human createWhiteHuman();

    /**
     * 黑人
     * @return
     */
    public Human createBlackHuman();

    /**
     * 黄种人
     * @return
     */
    public Human createYellowHuman();
}
