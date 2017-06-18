package JavaSE.DesignPatterns.FactoryPattern.TestFactory;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/10.
 * ---------------���׼�����-----------------
 */
public class Test {
    public static void main(String[] args) {
        //���������
        System.out.println("----���������----");
        Scanner scan = new Scanner(System.in);
        System.out.println("�������һ����������");
        String strnum1 = scan.nextLine();
        System.out.println("�������������");
        String oper = scan.nextLine();
        System.out.println("������ڶ�����������");
        String strnum2 = scan.nextLine();
        //���м���
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
        //������
        System.out.println(strnum1 + oper + strnum2 + "=" + result);
    }
}
