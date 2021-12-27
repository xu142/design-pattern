package currency;

/**
 * @Author: An
 * @Date: 2021/12/22 14:10
 */
public class ConcreteComponent extends Component{

    //具体实现
    @Override
    public void operate() {
        System.out.println("do Something");
    }
}
