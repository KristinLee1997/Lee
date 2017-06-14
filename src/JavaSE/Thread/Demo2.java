package JavaSE.Thread;

/**
 * Created by Administrator on 2017/5/30.
 * ----------创建·线程方法二·-------------
 */
public class Demo2 {
    public static void main(String[] args) {
        Test t = new Test("Lee");
        Thread a = new Thread(t);
        Thread b = new Thread(t);
        a.start();
        b.start();

    }
}

class Test implements Runnable {

    private String name;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            System.out.println("name=" + name + " " + Thread.currentThread().getName() + " " + i);
        }
    }
}
