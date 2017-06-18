package JavaSE.DesignPatterns.FactoryPattern.TestFactory;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/10.
 * ---------------简易计算器-----------------
 */
public class Test {
    public static void main(String[] args) {
        //输入操作数
        System.out.println("----计算机程序----");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个操作数：");
        String strnum1 = scan.nextLine();
        System.out.println("请输入运算符：");
        String oper = scan.nextLine();
        System.out.println("请输入第二个操作数：");
        String strnum2 = scan.nextLine();
        //进行计算
        double result = 0.0;
        if (oper.equals("+")) {
            Operation add=new AddOperation();
            add.setNum1(strnum1);
            add.setNum2(strnum2);
            result=add.getResult();
        } else if (oper.equals("-")) {
            Operation sub=new SubOperation();
            sub.setNum1(strnum1);
            sub.setNum2(strnum2);
            result=sub.getResult();
        } else if (oper.equals("*")) {
            Operation mul=new MulOperation();
            mul.setNum1(strnum1);
            mul.setNum2(strnum2);
            result=mul.getResult();
        } else if (oper.equals("/")) {
            Operation div=new MulOperation();
            div.setNum1(strnum1);
            div.setNum2(strnum2);
            result=div.getResult();
        }
        //输出结果
        System.out.println(strnum1 + oper + strnum2 + "=" + result);
    }
}
