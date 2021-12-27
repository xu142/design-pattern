package better;

import java.util.ArrayList;

/**
 * @Author: An
 * @Date: 2021/12/23 10:30
 */
public class Branch extends Corp{

    //领导下边有哪些下级领导和小兵
    ArrayList<Corp> subordinateList = new ArrayList<Corp>();
    //构造函数是必需的
    public Branch(String _name,String _position,int _salary){
        super(_name,_position,_salary);
    }
    //增加一个下属， 可能是小头目， 也可能是个小兵
    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }
    //我有哪些下属
    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
