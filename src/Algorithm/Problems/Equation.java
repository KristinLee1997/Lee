package Algorithm.Problems;

/**
 * Created by Administrator on 2017/6/8.
 * 华为笔试题：将一角，两角，五角组成一元。共有多少种方法？
 * 解析：
 * x+2y+5z=10
 * 10   0
 * 5    1
 * 0    2
 * x+2y=10--有10/2+1种方法 \
 * x+2y=5--有5/2+1种方法     *3=30(种)
 * x+2y=0--有0/2+1种方法   /
 */
public class Equation {
    public static void main(String[] args) {
        new Equation().fun1();
        new Equation().fun2();
    }

    public void fun1() {    //直观方法，时间复杂度太大，不好
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

    public void fun2() {    //一层循环，好！！！
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
