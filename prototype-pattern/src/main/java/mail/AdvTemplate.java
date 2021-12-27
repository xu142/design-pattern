package mail;

/**
 * 广告信模板
 * @Author: An
 * @Date: 2021/12/21 14:49
 */
public class AdvTemplate {
    //广告信名称
    private String advSubject ="XX银行国庆信用卡抽奖活动";
    //广告信内容
    private String advContext = "国庆抽奖活动通知： 只要刷卡就送你一百万！ ...";
    //取得广告信的名称
    public String getAdvSubject(){
        return this.advSubject;
    }
    //取得广告信的内容
    public String getAdvContext(){
        return this.advContext;
    }
}
