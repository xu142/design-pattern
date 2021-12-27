package before;

import java.util.HashMap;

/**
 * @Author: An
 * @Date: 2021/12/24 17:45
 */
public class VarExpression extends Expression{
    private String key;
    public VarExpression(String _key){
        this.key = _key;
    }

    //从map中取之
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
