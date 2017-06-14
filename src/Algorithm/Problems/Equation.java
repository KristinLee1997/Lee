package Algorithm.Problems;

/**
 * Created by Administrator on 2017/6/8.
 * ��Ϊ�����⣺��һ�ǣ����ǣ�������һԪ�����ж����ַ�����
 * ������
 * x+2y+5z=10
 * 10   0
 * 5    1
 * 0    2
 * x+2y=10--��10/2+1�ַ��� \
 * x+2y=5--��5/2+1�ַ���     *3=30(��)
 * x+2y=0--��0/2+1�ַ���   /
 */
public class Equation {
    public static void main(String[] args) {
        new Equation().fun1();
        new Equation().fun2();
    }

    public void fun1() {    //ֱ�۷�����ʱ�临�Ӷ�̫�󣬲���
        int count = 0;
        for (int z = 0; z <= 10; z++) {
            for (int y = 0; y <= 10; y++) {
                for (int x = 0; x <= 10; x++) {
                    if (x + 2 * y + 5 * z == 10)
                        count++;
                }
            }
        }
        System.out.println(count);
    }

    public void fun2() {    //һ��ѭ�����ã�����
        int a = 1;
        int b = 2;
        int c = 5;
        int count = 0;
        for (int i = 0; i < b + 1; i++) {
            count += (10 - i * c) / b + 1;
        }
        System.out.println(count);
    }
}
