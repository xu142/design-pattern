package better;

/**
 * @Author: An
 * @Date: 2021/12/23 13:58
 */
public interface Observer {

    //一发现别人有动静， 自己也要行动起来
    public void update(String context);
}
