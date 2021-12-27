package attention.deep;

import java.util.ArrayList;

/**
 * @Author: An
 * @Date: 2021/12/21 15:36
 */
public class Thing implements Cloneable{

    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    public Thing clone(){
        Thing thing=null;
        try {
            thing = (Thing)super.clone();
            // 对私有的类变量进行独立的拷贝
            thing.arrayList = (ArrayList<String>)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
