package after;

import before.IWomen;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: An
 * @Date: 2021/12/22 11:05
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for(int i=0;i<5;i++){
            arrayList.add(new Women(rand.nextInt(4),"我要出去逛街"));
        }
        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for(IWomen women:arrayList){
            System.out.println("-----------begin-----------");
            System.out.printf("请求的类型：%d,\n",women.getType());
            father.HandleMessage(women);
            System.out.println("-----------end-----------");

        }
    }
}
