package before;

import java.util.HashMap;

/**
 * @Author: An
 * @Date: 2021/12/24 17:35
 */
public abstract class Expression {
    //解析公式和数值， 其中var中的key值是公式中的参数， value值是具体的数字
    public abstract int interpreter(HashMap<String,Integer> var);
}
