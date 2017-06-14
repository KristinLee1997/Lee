package Train;

/**
 * Created by Administrator on 2017/5/7.
 */
/*内部类在局部位置上,只能访问被final修饰的局部变量*/
public class Outer3 {
    public static void main(String[] args) {
        Outer n = new Outer();
        n.method();
    }
}

class Outer {
    int num = 3;

    void method() {
        final int x = 10;
        int y = 2;
        class Inner {
            void show() {
                //System.out.println("y="+y);//访问失败，y的生命周期太短了
                System.out.println("x=" + x);
                System.out.println("inner run..." + num);
            }
        }
        new Inner().show();
    }
}
