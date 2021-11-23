package com.design.template;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

/**
 * @Author: Xiao An
 * @Description: Http
 * @Date Created in 2021--11--23 23:25
 * @Modified By:
 */

public class HttpClient {

    public static String doGet(String httpUrl) {
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        // 返回结果字符串
        String result = null;
        try {
            // 创建远程url 连接对象
            URL url = new URL(httpUrl);
            // 通过远程url连接对象打开一连接，强转成httpURLConnection类
            connection = (HttpURLConnection) url.openConnection();
            // 设置连接方式：get
            connection.setRequestMethod("GET");
            // 设置连接主机服务器的超时时间 ：15000毫秒
            connection.setConnectTimeout(15000);
            // 设置读取远程返回的数据时间 ： 60000毫秒
            connection.setReadTimeout(60000);
            // 发送请求
            connection.connect();
            // 通过connection连接， 获取输入流
            if (connection.getResponseCode() == 200) {
                inputStream = connection.getInputStream();
                // 封装输入流 inputStream 并指定字符串
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                // 存放数据
                StringBuffer stringBuffer = new StringBuffer();
                String temp = null;
                while ((temp = bufferedReader.readLine()) != null) {
                    stringBuffer.append(temp);
                    stringBuffer.append("\r\n");
                }
                result = stringBuffer.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  finally {
            // 关闭资源
            if (Objects.nonNull(bufferedReader)) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            assert connection != null;
            connection.disconnect();
        }
        return result;
    }
}
