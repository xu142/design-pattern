package com.design.template;

import com.design.template.group.JDNetMall;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: Xiao An
 * @Description:
 * @Date Created in 2021--11--23 23:47
 * @Modified By:
 */

public class Test {

    public Logger logger = LoggerFactory.getLogger(Test.class);

    /**
     * 测试链接
     * 京东；https://item.jd.com/100008348542.html
     * 淘宝；https://detail.tmall.com/item.htm
     * 当当；http://product.dangdang.com/1509704171.html
     */
    @org.junit.Test
    public void test_NetMall() {
        NetMall netMall = new JDNetMall("1000001","*******");
        String base64 = netMall.generateGoodsPoster("https://item.jd.com/100008348542.html");
        logger.info("测试结果：{}", base64);
    }
}
