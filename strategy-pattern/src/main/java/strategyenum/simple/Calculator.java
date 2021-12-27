package strategyenum.simple;

/**
 * @Author: An
 * @Date: 2021/12/22 15:13
 */
public class Calculator {
    //加符号
    private final static String ADD_SYMBOL = "+";
    //减符号
    private final static String SUB_SYMBOL = "-";
    public int exec(int a,int b,String symbol){
        return symbol.equals(ADD_SYMBOL)?a+b:a-b;
    }
}
