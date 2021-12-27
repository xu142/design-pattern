package mail;

import java.util.Random;
// 程序问题：
// 这是一个线程在运行，也就是说发送的是单线程的，按照一封邮件发出去需要0.02秒，
// 600万封邮件需要33个小时， 也就是一个整天都发送不完
// 今天的没发送完， 明天的账单又产生了， 日积月累

// 多线程问题：
// 产生第一封邮件对象， 放到线程1中运行， 还没有发送出去； 线程2也启动了， 直接就把邮件对象mail的收件人地址和称谓修改掉了， 线程不安全了。
/**
 * @Author: An
 * @Date: 2021/12/21 14:51
 */
public class Client {
    //发送账单的数量， 这个值是从数据库中获得
    private static int MAX_COUNT = 6;//发送账单的数量，这个值是从数据库中获得

    public static void main(String[] args){//模拟发送邮件
        int i=0;
        //把模板定义出来，这个是从数据库中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while(i<MAX_COUNT){
            //以下是每封邮件不同的地方
            mail.setAppellation(getRandString(5)+" 先生（女士）");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8)+".com");
            //然后发送邮件
            sendMail(mail);
            i++;
        }

    }

    //发送邮件
    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject() + "\t收件人："+mail.getReceiver()+"\t....发送成功！");
    }

    //获得指定长度的随机字符串

    public static String getRandString(int maxLength){
        String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
