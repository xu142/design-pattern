package strategyenum.strategy;

/**
 * @Author: An
 * @Date: 2021/12/22 15:14
 */
public class Sub implements Calculator{
    //减法运算
    public int exec(int a, int b) {
        return a-b;
    }
}
