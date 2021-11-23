package com.design.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Author: Xiao An
 * @Description: 定义执行顺序的抽象类
 * @Date Created in 2021--11--22 23:53
 * @Modified By:
 */

public abstract class NetMall {

    protected Logger logger = LoggerFactory.getLogger(NetMall.class);

    /**
     * 用户ID
     */
    String uId;
    /**
     * 用户密码
     */
    String uPwd;

    /**
     * 构造函数
     * @param uId 用户ID
     * @param uPwd 用户密码
     */
    public NetMall(String uId, String uPwd) {
        this.uId = uId;
        this.uPwd = uPwd;
    }

    /**
     * 生成商品推广海报
     * @param skuUrl 商品地址（京东 ，淘宝， 当当）
     * @return
     */
    public String generateGoodsPoster(String skuUrl) {
        // 1. 验证登录
        if (!login(uId, uPwd)){
            return null;
        }
        // 2. 爬虫商品
        Map<String, String> reptile = reptile(skuUrl);
        // 3. 组装海报
        return createBase64(reptile);
    }

    /**
     * 模拟登录
     * @param uId 用户ID
     * @param uPwd  用户密码
     * @return 返回登录结果
     */
    protected abstract Boolean login(String uId, String uPwd) ;

    /**
     * 爬虫提取商品信息（登录后的优惠价格）
     * @param skuUrl 商品地址
     * @return 商品信息
     */
    protected abstract Map<String, String> reptile(String skuUrl);

    /**
     * 生成商品海报信息
     * @param goodsInfo 商品信息
     * @return 商品海报信息
     */
    protected abstract String createBase64(Map<String, String> goodsInfo);
}
