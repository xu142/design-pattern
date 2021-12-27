package attention.constructure;

/**
 * @Author: An
 * @Date: 2021/12/21 15:21
 */
public class Thing implements Cloneable{
    public Thing(){
        System.out.println("构造函数被执行了...");
    }
    @Override
    public Thing clone(){
        Thing thing=null;
        try {
            thing = (Thing)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
