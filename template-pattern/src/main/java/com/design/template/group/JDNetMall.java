package com.design.template.group;

import com.alibaba.fastjson.JSON;
import com.design.template.HttpClient;
import com.design.template.NetMall;
import sun.misc.BASE64Encoder;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Xiao An
 * @Description: 模拟爬虫京东
 * @Date Created in 2021--11--23 23:21
 * @Modified By:
 */

public class JDNetMall extends NetMall {

    /**
     * 构造函数
     *
     * @param uId  用户ID
     * @param uPwd 用户密码
     */
    public JDNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    /**
     * 模拟登录
     *
     * @param uId  用户ID
     * @param uPwd 用户密码
     * @return 返回登录结果
     */
    @Override
    protected Boolean login(String uId, String uPwd) {
        logger.info("模拟京东用户登录 uId: {} uPwd: {}", uId, uPwd);
        return true;
    }

    /**
     * 爬虫提取商品信息（登录后的优惠价格）
     *
     * @param skuUrl 商品地址
     * @return 商品信息
     */
    @Override
    protected Map<String, String> reptile(String skuUrl) {
        String str = HttpClient.doGet(skuUrl);
        Pattern p9 = Pattern.compile("(?<=title\\\\>).*(?=</title)");
        Matcher m9 = p9.matcher(str);
        Map<String, String> map = new ConcurrentHashMap<String, String>();
        if (m9.find()){
            map.put("name", m9.group());
        }
        map.put("price", "5999.00");
        logger.info("模拟京东商品爬虫解析：{} | {} 元 {}",map.get("name"), map.get("price"), skuUrl);
        return map;
    }

    /**
     * 生成商品海报信息
     *
     * @param goodsInfo 商品信息
     * @return 商品海报信息
     */
    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        BASE64Encoder encoder = new BASE64Encoder();
        logger.info("模拟生成京东商品base64海报");
        return encoder.encode(JSON.toJSONString(goodsInfo).getBytes());
    }
}
