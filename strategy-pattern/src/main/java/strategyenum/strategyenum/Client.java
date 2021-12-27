package strategyenum.strategyenum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: An
 * @Date: 2021/12/22 15:18
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入的两个参数是数字
        System.out.println("请输入a");
        int a = scanner.nextInt();
        System.out.printf("请输入符号:");
        String symbol = scanner.next(); //符号
        System.out.println("请输入b");
        int b = scanner.nextInt();
        System.out.println("运行结果为： "+a+symbol+b+"="+(symbol.equals("+") ? Calculator.ADD.exec(a,b) :
                Calculator.SUB.exec(a,b)));

    }
}
