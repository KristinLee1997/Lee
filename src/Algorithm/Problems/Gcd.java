package Algorithm.Problems;

/*Created by Administrator on 2017/6/13.
 *�����Լ��֮շת��������������������Ϸ�
 * fun1:շת�����
 * fun2:���������
 * fun3:շת������͸���������Ļ�Ϸ�
 * */
public class Gcd {
    public static void main(String[] args) {
        System.out.println(fun2(25, 35));
    }

    public static int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }

    public static int fun1(int a, int b) {// շת���������������������������ʱ��ȡģ�������ܽϵ�
        int result = 1;
        if (a < b)
            return fun1(b, a);
        else {
            result = gcd(a, b);
            return result;
        }
    }

    public static int fun2(int a, int b) {// ���������
        if (a - b == 0)
            return b;
        else if (a > b)
            return fun2(a - b, b);
        else
            return fun2(b - a, a);
    }

    public static int fun3(int a, int b) {// ��Ϸ� ���������ȡģ�Լ��������������
        if (a % 2 == 0 && b % 2 == 0)
            return 2 * gcd(a / 2, b / 2);
        else if (a % 2 == 0 && b % 2 == 1)
            return gcd(a / 2, b);
        else if (a % 2 == 1 && b % 2 == 0)
            return gcd(a, b / 2);
        else if (a % 2 == 1 && b % 2 == 1)
            return gcd(b, a - b);
        else
            return 0;
    }
}

