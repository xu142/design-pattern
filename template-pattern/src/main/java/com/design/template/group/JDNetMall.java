package com.design.template.group;

import com.design.template.HttpClient;
import com.design.template.NetMall;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Author: An
 * @Date: 2021/11/10 16:21
 */
public class JDNetMall extends NetMall {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public JDNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    protected boolean login(String uId, String uPwd) {
        logger.info("模拟京东用户登录 uId:{} uPwd: {}", uId, uPwd);
        return true;
    }

    @Override
    protected Map<String, String> reptile(String skuUrl) {
        return null;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        return null;
    }
}
