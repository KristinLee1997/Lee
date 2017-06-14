package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/2.
 */
public class Demo6 {
    public static void main(String[] args) {
        Consumers c = new Consumers();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}

class Banker {
    private int sum;

    public void add(int money) {
        synchronized (this) {
            sum += money;
            System.out.println("sum=" + sum);
        }
    }
}

class Consumers implements Runnable {
    private Banker b = new Banker();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            b.add(100);
        }
    }
}
