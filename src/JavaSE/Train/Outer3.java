package Train;

/**
 * Created by Administrator on 2017/5/7.
 */
/*�ڲ����ھֲ�λ����,ֻ�ܷ��ʱ�final���εľֲ�����*/
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
                //System.out.println("y="+y);//����ʧ�ܣ�y����������̫����
                System.out.println("x=" + x);
                System.out.println("inner run..." + num);
            }
        }
        new Inner().show();
    }
}
