package multistate;

import java.util.HashMap;

/**
 * @Author: An
 * @Date: 2021/12/23 16:29
 */
public class Memento {
    //接受HashMap作为状态
    private HashMap<String,Object> stateMap;
    //接受一个对象， 建立一个备份
    public Memento(HashMap<String,Object> map){
        this.stateMap = map;
    }

    public HashMap<String,Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String,Object> stateMap) {
        this.stateMap = stateMap;
    }
}
