package Algorithm.Problems;

/*Created by Administrator on 2017/6/13.
 *求最大公约数之辗转相除法，更相减损术，混合法
 * fun1:辗转相除法
 * fun2:更相减损术
 * fun3:辗转相除法和更相减损术的混合法
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

    public static int fun1(int a, int b) {// 辗转相除法，当两个大整数进行运算时，取模运算性能较低
        int result = 1;
        if (a < b)
            return fun1(b, a);
        else {
            result = gcd(a, b);
            return result;
        }
    }

    public static int fun2(int a, int b) {// 更相减损术
        if (a - b == 0)
            return b;
        else if (a > b)
            return fun2(a - b, b);
        else
            return fun2(b - a, a);
    }

    public static int fun3(int a, int b) {// 混合法 避免大整数取模以及减少了运算次数
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

