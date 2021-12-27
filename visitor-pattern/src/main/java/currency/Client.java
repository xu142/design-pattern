package currency;

/**
 * @Author: An
 * @Date: 2021/12/23 18:58
 */
public class Client {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            //获得元素对象Element
            Element el = ObjectStructure.createElement();
            //接受访问者访问
            el.accept(new Visitor());

        }
    }
}
