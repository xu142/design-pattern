package strategyenum.strategy;

/**
 * @Author: An
 * @Date: 2021/12/22 15:13
 */
public class Add implements Calculator{
    //加法运算
    public int exec(int a, int b) {
        return a+b;
    }
}
