package attention.clonefinal;

import java.util.ArrayList;

/**
 * @Author: An
 * @Date: 2021/12/21 15:48
 */
public class Thing implements Cloneable{
    //定义一个私有变量
    private final ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    public Thing clone(){
        Thing thing=null;
        try {
            thing = (Thing)super.clone();
            // 错误
            // this.arrayList = (ArrayList<String>)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
